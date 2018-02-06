package tdi.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import tdi.entity.Propinsi;

@Repository
public class PropinsiRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Propinsi> show() {
        return jdbcTemplate.query("Select id_propinsi, id_negara, nm_propinsi from m_propinsi", new Object[]{}, (rs, rowNum) -> {
            Propinsi pro = new Propinsi();
            pro.setId(rs.getInt("id_propinsi"));
            pro.setIdNegara(rs.getInt("id_negara"));
            pro.setNamaPropinsi(rs.getString("nm_propinsi"));
            return pro;
        });
    }
    
    public Propinsi cari(Integer id){
        
        return jdbcTemplate.queryForObject("Select id_propinsi, id_negara, nm_propinsi from m_propinsi where id_propinsi = ?", new Object[]{id},(rs,rowNum)->{
        Propinsi pro = new Propinsi();
        pro.setId(rs.getInt("id_propinsi"));
        pro.setIdNegara(rs.getInt("id_negara"));
        pro.setNamaPropinsi(rs.getString("nm_propinsi"));
        return pro;
    });
    }

    public void save(Propinsi propinsi) {
        Map<String, Object> param = new HashMap<>();
        param.put("id", propinsi.getId());
        param.put("idNegara", propinsi.getIdNegara());
        param.put("namaPropinsi", propinsi.getNamaPropinsi());
        namedParameterJdbcTemplate.update("Insert into m_propinsi(id_propinsi, id_negara, nm_propinsi) values(:id,:idNegara,:namaPropinsi)", param);
    }
}

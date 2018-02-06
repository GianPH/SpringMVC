/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdi.entity;

public class Propinsi {

    private Integer id;
    private Integer idNegara;
    private String namaPropinsi;

    public Propinsi() {

    }

    public Propinsi(Integer id, Integer idNegara, String namaPropinsi) {
        this.id = id;
        this.idNegara = idNegara;
        this.namaPropinsi = namaPropinsi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdNegara() {
        return idNegara;
    }

    public void setIdNegara(Integer idNegara) {
        this.idNegara = idNegara;
    }

    public String getNamaPropinsi() {
        return namaPropinsi;
    }

    public void setNamaPropinsi(String namaPropinsi) {
        this.namaPropinsi = namaPropinsi;
    }

}

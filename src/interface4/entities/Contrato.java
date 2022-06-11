package interface4.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

  private Integer numero;
  private Date data;
  private Double valorTotal;

  private List<Parcelamento> parcelamentos = new ArrayList<>();

  public Contrato(Integer numero, Date data, Double valorTotal) {
    this.numero = numero;
    this.data = data;
    this.valorTotal = valorTotal;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public Double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(Double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public List<Parcelamento> getParcelamentos() {
    return parcelamentos;
  }

  public void addParcelamento(Parcelamento p) {
    parcelamentos.add(p);
  }

  public void removeParcelamento(Parcelamento p) {
    parcelamentos.remove(p);
  }

}

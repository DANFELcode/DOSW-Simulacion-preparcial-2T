package edu.eci.dosw.oficioya.model;

public class TradeModel {
    private Long id;
    private String name;

    public TradeModel() {}
    public TradeModel(Long id, String name) { this.id = id; this.name = name; }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
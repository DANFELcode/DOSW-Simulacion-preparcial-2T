package edu.eci.dosw.oficioya.model;

public class WorkerModel {
    private Long id;
    private UserModel user;
    private TradeModel mainTrade;
    private WorkerStatus status;

    public WorkerModel() {}
    public WorkerModel(Long id, UserModel user, TradeModel mainTrade, WorkerStatus status) {
        this.id = id; this.user = user; this.mainTrade = mainTrade; this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public UserModel getUser() { return user; }
    public void setUser(UserModel user) { this.user = user; }
    public TradeModel getMainTrade() { return mainTrade; }
    public void setMainTrade(TradeModel mainTrade) { this.mainTrade = mainTrade; }
    public WorkerStatus getStatus() { return status; }
    public void setStatus(WorkerStatus status) { this.status = status; }
}
package template;

public class TransferMoneyTask {
    private AuditTrial auditTrial;

    public TransferMoneyTask(AuditTrial auditTrial) {
        this.auditTrial = auditTrial;
    }

    public void execute() {
        auditTrial.record();
        System.out.println("Transfer Money");
    }
}

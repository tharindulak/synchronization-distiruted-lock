package iit.cw.synchronization;

public interface DistributedTxListener {
    void onGlobalCommit();
    void onGlobalAbort();
}

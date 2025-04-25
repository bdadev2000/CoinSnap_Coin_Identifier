package androidx.work.impl;

/* loaded from: classes7.dex */
public interface ExecutionListener {
    void onExecuted(String workSpecId, boolean needsReschedule);
}

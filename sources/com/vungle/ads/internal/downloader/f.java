package com.vungle.ads.internal.downloader;

/* loaded from: classes4.dex */
public final class f {
    private static int STARTED;
    static final /* synthetic */ f $$INSTANCE = new f();
    private static int IN_PROGRESS = 1;
    private static int PAUSED = 2;
    private static int CANCELLED = 3;
    private static int DONE = 4;
    private static int LOST_CONNECTION = 5;
    private static int STATE_CHANGED = 6;
    private static int ERROR = 7;

    private f() {
    }

    public final int getCANCELLED() {
        return CANCELLED;
    }

    public final int getDONE() {
        return DONE;
    }

    public final int getERROR() {
        return ERROR;
    }

    public final int getIN_PROGRESS() {
        return IN_PROGRESS;
    }

    public final int getLOST_CONNECTION() {
        return LOST_CONNECTION;
    }

    public final int getPAUSED() {
        return PAUSED;
    }

    public final int getSTARTED() {
        return STARTED;
    }

    public final int getSTATE_CHANGED() {
        return STATE_CHANGED;
    }

    public final void setCANCELLED(int i10) {
        CANCELLED = i10;
    }

    public final void setDONE(int i10) {
        DONE = i10;
    }

    public final void setERROR(int i10) {
        ERROR = i10;
    }

    public final void setIN_PROGRESS(int i10) {
        IN_PROGRESS = i10;
    }

    public final void setLOST_CONNECTION(int i10) {
        LOST_CONNECTION = i10;
    }

    public final void setPAUSED(int i10) {
        PAUSED = i10;
    }

    public final void setSTARTED(int i10) {
        STARTED = i10;
    }

    public final void setSTATE_CHANGED(int i10) {
        STATE_CHANGED = i10;
    }
}

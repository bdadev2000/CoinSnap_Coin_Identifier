package com.vungle.ads.internal.downloader;

/* loaded from: classes3.dex */
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

    public final void setCANCELLED(int i9) {
        CANCELLED = i9;
    }

    public final void setDONE(int i9) {
        DONE = i9;
    }

    public final void setERROR(int i9) {
        ERROR = i9;
    }

    public final void setIN_PROGRESS(int i9) {
        IN_PROGRESS = i9;
    }

    public final void setLOST_CONNECTION(int i9) {
        LOST_CONNECTION = i9;
    }

    public final void setPAUSED(int i9) {
        PAUSED = i9;
    }

    public final void setSTARTED(int i9) {
        STARTED = i9;
    }

    public final void setSTATE_CHANGED(int i9) {
        STATE_CHANGED = i9;
    }
}

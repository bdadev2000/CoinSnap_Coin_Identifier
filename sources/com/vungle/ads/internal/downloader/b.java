package com.vungle.ads.internal.downloader;

/* loaded from: classes3.dex */
public final class b {
    private static int CONNECTION_ERROR;
    static final /* synthetic */ b $$INSTANCE = new b();
    private static int REQUEST_ERROR = 1;
    private static int DISK_ERROR = 2;
    private static int FILE_NOT_FOUND_ERROR = 3;
    private static int INTERNAL_ERROR = 4;

    private b() {
    }

    public final int getCONNECTION_ERROR() {
        return CONNECTION_ERROR;
    }

    public final int getDISK_ERROR() {
        return DISK_ERROR;
    }

    public final int getFILE_NOT_FOUND_ERROR() {
        return FILE_NOT_FOUND_ERROR;
    }

    public final int getINTERNAL_ERROR() {
        return INTERNAL_ERROR;
    }

    public final int getREQUEST_ERROR() {
        return REQUEST_ERROR;
    }

    public final void setCONNECTION_ERROR(int i9) {
        CONNECTION_ERROR = i9;
    }

    public final void setDISK_ERROR(int i9) {
        DISK_ERROR = i9;
    }

    public final void setFILE_NOT_FOUND_ERROR(int i9) {
        FILE_NOT_FOUND_ERROR = i9;
    }

    public final void setINTERNAL_ERROR(int i9) {
        INTERNAL_ERROR = i9;
    }

    public final void setREQUEST_ERROR(int i9) {
        REQUEST_ERROR = i9;
    }
}

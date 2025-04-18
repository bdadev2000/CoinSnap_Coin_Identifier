package com.bytedance.sdk.component.tN.YFl;

import android.os.SystemClock;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class YFl {
    long AlY;
    long DSW;
    long Sg;
    long YFl = SystemClock.elapsedRealtime();
    long qsH;
    long tN;

    /* renamed from: vc, reason: collision with root package name */
    long f10441vc;
    long wN;

    public long AlY() {
        return this.YFl;
    }

    public long DSW() {
        return this.tN;
    }

    public void EH() {
        this.Sg = SystemClock.elapsedRealtime();
    }

    public void GA() {
        this.qsH = SystemClock.elapsedRealtime();
    }

    public long NjR() {
        return this.wN;
    }

    public void Sg() {
        this.AlY = SystemClock.elapsedRealtime();
    }

    public void YFl() {
        this.tN = SystemClock.elapsedRealtime();
    }

    public long YoT() {
        return this.qsH;
    }

    public void eT() {
        this.DSW = SystemClock.elapsedRealtime();
    }

    public long nc() {
        return this.DSW;
    }

    public long pDU() {
        return this.Sg;
    }

    public long qsH() {
        return this.AlY;
    }

    public void tN() {
        this.wN = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.YFl + ", asyncCallExecTs=" + this.Sg + ", requestStartExecTs=" + this.tN + ", requestConnectStartTs=" + this.AlY + ", requestConnectFinishTs=" + this.wN + ", reqCallServerStartTs=" + this.DSW + ", reqCallServerFinishTs=" + this.qsH + AbstractJsonLexerKt.END_OBJ;
    }

    public long vc() {
        return this.f10441vc;
    }

    public void wN() {
        this.f10441vc = SystemClock.elapsedRealtime();
    }
}

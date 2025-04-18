package com.bytedance.sdk.component.DSW;

import com.bytedance.sdk.component.Sg.YFl.nc;
import java.io.File;
import java.util.Map;

/* loaded from: classes.dex */
public class Sg {
    final String AlY;
    nc DSW;
    private final boolean NjR;
    final String Sg;
    final int YFl;
    final Map<String, String> tN;

    /* renamed from: vc, reason: collision with root package name */
    final long f10310vc;
    final long wN;
    private File qsH = null;

    /* renamed from: nc, reason: collision with root package name */
    private byte[] f10309nc = null;

    public Sg(boolean z10, int i10, String str, Map<String, String> map, String str2, long j3, long j10) {
        this.NjR = z10;
        this.YFl = i10;
        this.Sg = str;
        this.tN = map;
        this.AlY = str2;
        this.wN = j3;
        this.f10310vc = j10;
    }

    public String AlY() {
        return this.AlY;
    }

    public long DSW() {
        return this.wN - this.f10310vc;
    }

    public String Sg() {
        return this.Sg;
    }

    public int YFl() {
        return this.YFl;
    }

    public nc qsH() {
        return this.DSW;
    }

    public Map<String, String> tN() {
        return this.tN;
    }

    public boolean vc() {
        return this.NjR;
    }

    public File wN() {
        return this.qsH;
    }

    public void YFl(File file) {
        this.qsH = file;
    }

    public void YFl(byte[] bArr) {
        this.f10309nc = bArr;
    }

    public void YFl(nc ncVar) {
        this.DSW = ncVar;
    }
}

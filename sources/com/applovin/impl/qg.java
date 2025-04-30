package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.dl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class qg extends dl {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f10344o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n, reason: collision with root package name */
    private boolean f10345n;

    private long a(byte[] bArr) {
        int i9;
        byte b = bArr[0];
        int i10 = b & 255;
        int i11 = b & 3;
        if (i11 != 0) {
            i9 = 2;
            if (i11 != 1 && i11 != 2) {
                i9 = bArr[1] & 63;
            }
        } else {
            i9 = 1;
        }
        int i12 = i10 >> 3;
        return i9 * (i12 >= 16 ? DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << r0 : i12 >= 12 ? 10000 << (i12 & 1) : (i12 & 3) == 3 ? 60000 : 10000 << r0);
    }

    public static boolean b(yg ygVar) {
        int a6 = ygVar.a();
        byte[] bArr = f10344o;
        if (a6 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        ygVar.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.applovin.impl.dl
    public long a(yg ygVar) {
        return b(a(ygVar.c()));
    }

    @Override // com.applovin.impl.dl
    public boolean a(yg ygVar, long j7, dl.b bVar) {
        if (!this.f10345n) {
            byte[] copyOf = Arrays.copyOf(ygVar.c(), ygVar.e());
            bVar.f7333a = new d9.b().f(MimeTypes.AUDIO_OPUS).c(rg.b(copyOf)).n(48000).a(rg.a(copyOf)).a();
            this.f10345n = true;
            return true;
        }
        AbstractC0669a1.a(bVar.f7333a);
        boolean z8 = ygVar.j() == 1332770163;
        ygVar.f(0);
        return z8;
    }

    @Override // com.applovin.impl.dl
    public void a(boolean z8) {
        super.a(z8);
        if (z8) {
            this.f10345n = false;
        }
    }
}

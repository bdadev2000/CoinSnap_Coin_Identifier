package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.dl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class qg extends dl {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f7215o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n, reason: collision with root package name */
    private boolean f7216n;

    private long a(byte[] bArr) {
        int i10;
        byte b3 = bArr[0];
        int i11 = b3 & UByte.MAX_VALUE;
        int i12 = b3 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = bArr[1] & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return i10 * (i13 >= 16 ? DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << r0 : i13 >= 12 ? 10000 << (i13 & 1) : (i13 & 3) == 3 ? 60000 : 10000 << r0);
    }

    public static boolean b(yg ygVar) {
        int a = ygVar.a();
        byte[] bArr = f7215o;
        if (a < bArr.length) {
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
    public boolean a(yg ygVar, long j3, dl.b bVar) {
        if (!this.f7216n) {
            byte[] copyOf = Arrays.copyOf(ygVar.c(), ygVar.e());
            bVar.a = new d9.b().f(MimeTypes.AUDIO_OPUS).c(rg.b(copyOf)).n(48000).a(rg.a(copyOf)).a();
            this.f7216n = true;
            return true;
        }
        a1.a(bVar.a);
        boolean z10 = ygVar.j() == 1332770163;
        ygVar.f(0);
        return z10;
    }

    @Override // com.applovin.impl.dl
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f7216n = false;
        }
    }
}

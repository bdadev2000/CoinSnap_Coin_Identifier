package com.google.android.gms.internal.ads;

import a4.j;
import com.google.android.gms.internal.ads.zzgwx;
import com.google.android.gms.internal.ads.zzgwy;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzgwy<MessageType extends zzgwy<MessageType, BuilderType>, BuilderType extends zzgwx<MessageType, BuilderType>> implements zzhai {
    protected int zzq = 0;

    public static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzgwx.zzbd(iterable, list);
    }

    public static void zzaR(zzgxp zzgxpVar) throws IllegalArgumentException {
        if (zzgxpVar.zzp()) {
        } else {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String zzdI(String str) {
        return j.h("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public int zzaL() {
        throw new UnsupportedOperationException();
    }

    public int zzaM(zzhbb zzhbbVar) {
        return zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzhai
    public zzgxp zzaN() {
        try {
            int zzaY = zzaY();
            zzgxp zzgxpVar = zzgxp.zzb;
            byte[] bArr = new byte[zzaY];
            zzgxy zzgxyVar = new zzgxy(bArr, 0, zzaY);
            zzda(zzgxyVar);
            zzgxyVar.zzF();
            return new zzgxm(bArr);
        } catch (IOException e2) {
            throw new RuntimeException(zzdI("ByteString"), e2);
        }
    }

    public zzhan zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public zzhbm zzaP() {
        return new zzhbm(this);
    }

    public void zzaS(int i10) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) throws IOException {
        int zzaY = zzaY();
        zzgya zzgyaVar = new zzgya(outputStream, zzgyc.zzB(zzgyc.zzD(zzaY) + zzaY));
        zzgyaVar.zzu(zzaY);
        zzda(zzgyaVar);
        zzgyaVar.zzK();
    }

    public void zzaU(OutputStream outputStream) throws IOException {
        zzgya zzgyaVar = new zzgya(outputStream, zzgyc.zzB(zzaY()));
        zzda(zzgyaVar);
        zzgyaVar.zzK();
    }

    public byte[] zzaV() {
        try {
            int zzaY = zzaY();
            byte[] bArr = new byte[zzaY];
            zzgxy zzgxyVar = new zzgxy(bArr, 0, zzaY);
            zzda(zzgxyVar);
            zzgxyVar.zzF();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(zzdI("byte array"), e2);
        }
    }
}

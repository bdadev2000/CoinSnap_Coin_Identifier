package com.google.android.gms.internal.ads;

import Q7.n0;
import com.google.android.gms.internal.ads.zzgzh;
import com.google.android.gms.internal.ads.zzgzi;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzgzi<MessageType extends zzgzi<MessageType, BuilderType>, BuilderType extends zzgzh<MessageType, BuilderType>> implements zzhde {
    protected int zzq = 0;

    public static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzgzh.zzbd(iterable, list);
    }

    public static void zzaR(zzhac zzhacVar) throws IllegalArgumentException {
        if (zzhacVar.zzp()) {
        } else {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String zzdI(String str) {
        return n0.j("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public int zzaL() {
        throw new UnsupportedOperationException();
    }

    public int zzaM(zzhdz zzhdzVar) {
        return zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzhde
    public zzhac zzaN() {
        try {
            int zzaY = zzaY();
            zzhac zzhacVar = zzhac.zzb;
            byte[] bArr = new byte[zzaY];
            zzhat zzF = zzhat.zzF(bArr, 0, zzaY);
            zzda(zzF);
            zzF.zzG();
            return new zzgzy(bArr);
        } catch (IOException e4) {
            throw new RuntimeException(zzdI("ByteString"), e4);
        }
    }

    public zzhdj zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public zzhep zzaP() {
        return new zzhep(this);
    }

    public void zzaS(int i9) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) throws IOException {
        int zzaY = zzaY();
        zzhar zzharVar = new zzhar(outputStream, zzhat.zzB(zzhat.zzD(zzaY) + zzaY));
        zzharVar.zzu(zzaY);
        zzda(zzharVar);
        zzharVar.zzL();
    }

    public void zzaU(OutputStream outputStream) throws IOException {
        zzhar zzharVar = new zzhar(outputStream, zzhat.zzB(zzaY()));
        zzda(zzharVar);
        zzharVar.zzL();
    }

    public byte[] zzaV() {
        try {
            int zzaY = zzaY();
            byte[] bArr = new byte[zzaY];
            zzhat zzF = zzhat.zzF(bArr, 0, zzaY);
            zzda(zzF);
            zzF.zzG();
            return bArr;
        } catch (IOException e4) {
            throw new RuntimeException(zzdI("byte array"), e4);
        }
    }
}

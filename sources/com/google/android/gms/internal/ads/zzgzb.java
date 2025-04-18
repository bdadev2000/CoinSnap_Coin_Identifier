package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgza;
import com.google.android.gms.internal.ads.zzgzb;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzgzb<MessageType extends zzgzb<MessageType, BuilderType>, BuilderType extends zzgza<MessageType, BuilderType>> implements zzhcp {
    protected int zzq = 0;

    public static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzgza.zzbd(iterable, list);
    }

    public static void zzaR(zzgzs zzgzsVar) throws IllegalArgumentException {
        if (!zzgzsVar.zzp()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String zzdI(String str) {
        return androidx.compose.foundation.text.input.a.m("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public int zzaL() {
        throw new UnsupportedOperationException();
    }

    public int zzaM(zzhdk zzhdkVar) {
        return zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    public zzgzs zzaN() {
        try {
            int zzaY = zzaY();
            zzgzs zzgzsVar = zzgzs.zzb;
            byte[] bArr = new byte[zzaY];
            zzhaf zzhafVar = new zzhaf(bArr, 0, zzaY);
            zzda(zzhafVar);
            zzhafVar.zzF();
            return new zzgzq(bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdI("ByteString"), e);
        }
    }

    public zzhcu zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public zzhdx zzaP() {
        return new zzhdx(this);
    }

    public void zzaS(int i2) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) throws IOException {
        int zzaY = zzaY();
        zzhah zzhahVar = new zzhah(outputStream, zzhaj.zzB(zzhaj.zzD(zzaY) + zzaY));
        zzhahVar.zzu(zzaY);
        zzda(zzhahVar);
        zzhahVar.zzK();
    }

    public void zzaU(OutputStream outputStream) throws IOException {
        zzhah zzhahVar = new zzhah(outputStream, zzhaj.zzB(zzaY()));
        zzda(zzhahVar);
        zzhahVar.zzK();
    }

    public byte[] zzaV() {
        try {
            int zzaY = zzaY();
            byte[] bArr = new byte[zzaY];
            zzhaf zzhafVar = new zzhaf(bArr, 0, zzaY);
            zzda(zzhafVar);
            zzhafVar.zzF();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdI("byte array"), e);
        }
    }
}

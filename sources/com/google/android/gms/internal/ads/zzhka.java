package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class zzhka implements Iterator, Closeable, zzass {
    private static final zzasr zza = new zzhjz("eof ");
    private static final zzhkh zzb = zzhkh.zzb(zzhka.class);
    protected zzaso zzc;
    protected zzhkb zzd;
    zzasr zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzasr zzasrVar = this.zze;
        if (zzasrVar == zza) {
            return false;
        }
        if (zzasrVar != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i9 = 0; i9 < this.zzh.size(); i9++) {
            if (i9 > 0) {
                sb.append(";");
            }
            sb.append(((zzasr) this.zzh.get(i9)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzasr next() {
        zzasr zzb2;
        zzasr zzasrVar = this.zze;
        if (zzasrVar != null && zzasrVar != zza) {
            this.zze = null;
            return zzasrVar;
        }
        zzhkb zzhkbVar = this.zzd;
        if (zzhkbVar != null && this.zzf < this.zzg) {
            try {
                synchronized (zzhkbVar) {
                    this.zzd.zze(this.zzf);
                    zzb2 = this.zzc.zzb(this.zzd, this);
                    this.zzf = this.zzd.zzb();
                }
                return zzb2;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.zze = zza;
        throw new NoSuchElementException();
    }

    public final List zze() {
        if (this.zzd != null && this.zze != zza) {
            return new zzhkg(this.zzh, this);
        }
        return this.zzh;
    }

    public final void zzf(zzhkb zzhkbVar, long j7, zzaso zzasoVar) throws IOException {
        this.zzd = zzhkbVar;
        this.zzf = zzhkbVar.zzb();
        zzhkbVar.zze(zzhkbVar.zzb() + j7);
        this.zzg = zzhkbVar.zzb();
        this.zzc = zzasoVar;
    }
}

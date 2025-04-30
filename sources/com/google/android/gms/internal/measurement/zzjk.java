package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzjk.zzb;
import com.mbridge.msdk.foundation.entity.o;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class zzjk<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhq<MessageType, BuilderType> {
    private static Map<Object, zzjk<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzme zzb = zzme.zzc();

    /* loaded from: classes2.dex */
    public static class zza<T extends zzjk<T, ?>> extends zzhr<T> {
        public zza(T t9) {
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class zzb<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhp<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        public zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (!messagetype.zzcn()) {
                this.zza = (MessageType) messagetype.zzcd();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private final BuilderType zzb(byte[] bArr, int i9, int i10, zzix zzixVar) throws zzjs {
            if (!this.zza.zzcn()) {
                zzal();
            }
            try {
                zzlh.zza().zza((zzlh) this.zza).zza(this.zza, bArr, 0, i10, new zzhv(zzixVar));
                return this;
            } catch (zzjs e4) {
                throw e4;
            } catch (IOException e9) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
            } catch (IndexOutOfBoundsException unused) {
                throw zzjs.zzh();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.measurement.zzhp
        /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final BuilderType zzb(zzio zzioVar, zzix zzixVar) throws IOException {
            if (!this.zza.zzcn()) {
                zzal();
            }
            try {
                zzlh.zza().zza((zzlh) this.zza).zza(this.zza, zzis.zza(zzioVar), zzixVar);
                return this;
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof IOException) {
                    throw ((IOException) e4.getCause());
                }
                throw e4;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhp
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzbVar = (zzb) this.zzb.zza(zze.zze, null, null);
            zzbVar.zza = (MessageType) zzaj();
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzhp
        /* renamed from: zza */
        public final /* synthetic */ zzhp zzb(zzio zzioVar, zzix zzixVar) throws IOException {
            return (zzb) zzb(zzioVar, zzixVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzhp
        /* renamed from: zzaf */
        public final /* synthetic */ zzhp clone() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.measurement.zzks
        /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
        public final MessageType zzai() {
            MessageType messagetype = (MessageType) zzaj();
            if (zzjk.zza(messagetype, true)) {
                return messagetype;
            }
            throw new zzmc(messagetype);
        }

        @Override // com.google.android.gms.internal.measurement.zzks
        /* renamed from: zzah, reason: merged with bridge method [inline-methods] */
        public MessageType zzaj() {
            if (!this.zza.zzcn()) {
                return this.zza;
            }
            this.zza.zzck();
            return this.zza;
        }

        public final void zzak() {
            if (!this.zza.zzcn()) {
                zzal();
            }
        }

        public void zzal() {
            MessageType messagetype = (MessageType) this.zzb.zzcd();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.measurement.zzkv
        public final /* synthetic */ zzkt zzcj() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.measurement.zzkv
        public final boolean zzcm() {
            return zzjk.zza(this.zza, false);
        }

        @Override // com.google.android.gms.internal.measurement.zzhp
        public final /* synthetic */ zzhp zza(byte[] bArr, int i9, int i10) throws zzjs {
            return zzb(bArr, 0, i10, zzix.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzhp
        public final /* synthetic */ zzhp zza(byte[] bArr, int i9, int i10, zzix zzixVar) throws zzjs {
            return zzb(bArr, 0, i10, zzixVar);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzcn()) {
                zzal();
            }
            zza(this.zza, messagetype);
            return this;
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzlh.zza().zza((zzlh) messagetype).zza(messagetype, messagetype2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzc implements zzjf<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final zzmn zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final zzmx zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final zzks zza(zzks zzksVar, zzkt zzktVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        public final zzky zza(zzky zzkyVar, zzky zzkyVar2) {
            throw new NoSuchMethodError();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzjk<MessageType, BuilderType> implements zzkv {
        protected zzjd<zzc> zzc = zzjd.zzb();

        public final zzjd<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzjd) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* loaded from: classes2.dex */
    public enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    /* loaded from: classes2.dex */
    public static class zzf<ContainingType extends zzkt, Type> extends zziy<ContainingType, Type> {
    }

    private final int zza() {
        return zzlh.zza().zza((zzlh) this).zzb(this);
    }

    private final int zzb(zzll<?> zzllVar) {
        if (zzllVar == null) {
            return zzlh.zza().zza((zzlh) this).zza(this);
        }
        return zzllVar.zza(this);
    }

    public static zzjr zzce() {
        return zzjn.zzd();
    }

    public static zzjq zzcf() {
        return zzke.zzd();
    }

    public static <E> zzjt<E> zzcg() {
        return zzlg.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzlh.zza().zza((zzlh) this).zzb(this, (zzjk) obj);
    }

    public int hashCode() {
        if (zzcn()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzku.zza(this, super.toString());
    }

    public abstract Object zza(int i9, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final int zzbx() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final void zzc(int i9) {
        if (i9 >= 0) {
            this.zzd = (i9 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(o.h(i9, "serialized size must be non-negative, was "));
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final int zzca() {
        return zza((zzll) null);
    }

    public final <MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzcb() {
        return (BuilderType) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzcc() {
        return (BuilderType) ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza((zzb) this);
    }

    public final MessageType zzcd() {
        return (MessageType) zza(zze.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final /* synthetic */ zzks zzch() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final /* synthetic */ zzks zzci() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza((zzb) this);
    }

    @Override // com.google.android.gms.internal.measurement.zzkv
    public final /* synthetic */ zzkt zzcj() {
        return (zzjk) zza(zze.zzf, (Object) null, (Object) null);
    }

    public final void zzck() {
        zzlh.zza().zza((zzlh) this).zzc(this);
        zzcl();
    }

    public final void zzcl() {
        this.zzd &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzkv
    public final boolean zzcm() {
        return zza(this, true);
    }

    public final boolean zzcn() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final int zza(zzll zzllVar) {
        if (zzcn()) {
            int zzb2 = zzb(zzllVar);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException(o.h(zzb2, "serialized size must be non-negative, was "));
        }
        if (zzbx() != Integer.MAX_VALUE) {
            return zzbx();
        }
        int zzb3 = zzb(zzllVar);
        zzc(zzb3);
        return zzb3;
    }

    public static <T extends zzjk<?, ?>> T zza(Class<T> cls) {
        zzjk<?, ?> zzjkVar = zzc.get(cls);
        if (zzjkVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzjkVar = zzc.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (zzjkVar == null) {
            zzjkVar = (T) ((zzjk) zzmg.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (zzjkVar != null) {
                zzc.put(cls, zzjkVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) zzjkVar;
    }

    public static zzjq zza(zzjq zzjqVar) {
        int size = zzjqVar.size();
        return zzjqVar.zza(size == 0 ? 10 : size << 1);
    }

    public static <E> zzjt<E> zza(zzjt<E> zzjtVar) {
        int size = zzjtVar.size();
        return zzjtVar.zza(size == 0 ? 10 : size << 1);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object zza(zzkt zzktVar, String str, Object[] objArr) {
        return new zzlj(zzktVar, str, objArr);
    }

    public static <T extends zzjk<?, ?>> void zza(Class<T> cls, T t9) {
        t9.zzcl();
        zzc.put(cls, t9);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final void zza(zzit zzitVar) throws IOException {
        zzlh.zza().zza((zzlh) this).zza((zzll) this, (zzna) zziw.zza(zzitVar));
    }

    public static final <T extends zzjk<T, ?>> boolean zza(T t9, boolean z8) {
        byte byteValue = ((Byte) t9.zza(zze.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzlh.zza().zza((zzlh) t9).zzd(t9);
        if (z8) {
            t9.zza(zze.zzb, zzd2 ? t9 : null, null);
        }
        return zzd2;
    }
}

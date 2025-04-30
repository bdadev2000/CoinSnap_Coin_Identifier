package com.google.android.gms.internal.ads;

import Q7.n0;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbo;
import com.mbridge.msdk.foundation.entity.o;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class zzhbo<MessageType extends zzhbo<MessageType, BuilderType>, BuilderType extends zzhbi<MessageType, BuilderType>> extends zzgzi<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Object, zzhbo<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzher zzt = zzher.zzc();

    public static zzhbq zzbA() {
        return zzgzp.zzd();
    }

    public static zzhbq zzbB(zzhbq zzhbqVar) {
        int i9;
        int size = zzhbqVar.size();
        if (size == 0) {
            i9 = 10;
        } else {
            i9 = size + size;
        }
        return zzhbqVar.zzf(i9);
    }

    public static zzhbr zzbC() {
        return zzhav.zze();
    }

    public static zzhbr zzbD(zzhbr zzhbrVar) {
        int i9;
        int size = zzhbrVar.size();
        if (size == 0) {
            i9 = 10;
        } else {
            i9 = size + size;
        }
        return zzhbrVar.zzf(i9);
    }

    public static zzhbv zzbE() {
        return zzhbf.zze();
    }

    public static zzhbv zzbF(zzhbv zzhbvVar) {
        int i9;
        int size = zzhbvVar.size();
        if (size == 0) {
            i9 = 10;
        } else {
            i9 = size + size;
        }
        return zzhbvVar.zzf(i9);
    }

    public static zzhbw zzbG() {
        return zzhbp.zzg();
    }

    public static zzhbw zzbH(zzhbw zzhbwVar) {
        int i9;
        int size = zzhbwVar.size();
        if (size == 0) {
            i9 = 10;
        } else {
            i9 = size + size;
        }
        return zzhbwVar.zzf(i9);
    }

    public static zzhbz zzbI() {
        return zzhct.zzh();
    }

    public static zzhbz zzbJ(zzhbz zzhbzVar) {
        int i9;
        int size = zzhbzVar.size();
        if (size == 0) {
            i9 = 10;
        } else {
            i9 = size + size;
        }
        return zzhbzVar.zzf(i9);
    }

    public static <E> zzhca<E> zzbK() {
        return zzhdp.zzd();
    }

    public static <E> zzhca<E> zzbL(zzhca<E> zzhcaVar) {
        int i9;
        int size = zzhcaVar.size();
        if (size == 0) {
            i9 = 10;
        } else {
            i9 = size + size;
        }
        return zzhcaVar.zzf(i9);
    }

    public static Object zzbQ(Method method, Object obj, Object... objArr) {
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

    public static Object zzbR(zzhde zzhdeVar, String str, Object[] objArr) {
        return new zzhdq(zzhdeVar, str, objArr);
    }

    public static Method zzbS(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(n0.j("Generated message class \"", cls.getName(), "\" missing method \"", str, "\"."), e4);
        }
    }

    public static <ContainingType extends zzhde, Type> zzhbm<ContainingType, Type> zzbe(ContainingType containingtype, zzhde zzhdeVar, zzhbt zzhbtVar, int i9, zzhfg zzhfgVar, boolean z8, Class cls) {
        return new zzhbm<>(containingtype, Collections.emptyList(), zzhdeVar, new zzhbl(zzhbtVar, i9, zzhfgVar, true, z8), cls);
    }

    public static <ContainingType extends zzhde, Type> zzhbm<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzhde zzhdeVar, zzhbt zzhbtVar, int i9, zzhfg zzhfgVar, Class cls) {
        return new zzhbm<>(containingtype, type, zzhdeVar, new zzhbl(zzhbtVar, i9, zzhfgVar, false, false), cls);
    }

    public static <T extends zzhbo> T zzbh(Class<T> cls) {
        zzhbo<?, ?> zzhboVar = zzc.get(cls);
        if (zzhboVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzhboVar = zzc.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (zzhboVar == null) {
            zzhboVar = ((zzhbo) zzhfa.zzg(cls)).zzbt();
            if (zzhboVar != null) {
                zzc.put(cls, zzhboVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzhboVar;
    }

    public static <T extends zzhbo<T, ?>> T zzbk(T t9, InputStream inputStream) throws zzhcd {
        T t10 = (T) zzg(t9, inputStream, zzhay.zza);
        zzf(t10);
        return t10;
    }

    public static <T extends zzhbo<T, ?>> T zzbl(T t9, InputStream inputStream, zzhay zzhayVar) throws zzhcd {
        T t10 = (T) zzg(t9, inputStream, zzhayVar);
        zzf(t10);
        return t10;
    }

    public static <T extends zzhbo<T, ?>> T zzbm(T t9, zzhac zzhacVar) throws zzhcd {
        T t10 = (T) zzbr(t9, zzhacVar, zzhay.zza);
        zzf(t10);
        return t10;
    }

    public static <T extends zzhbo<T, ?>> T zzbn(T t9, zzham zzhamVar) throws zzhcd {
        return (T) zzbs(t9, zzhamVar, zzhay.zza);
    }

    public static <T extends zzhbo<T, ?>> T zzbo(T t9, InputStream inputStream) throws zzhcd {
        T t10 = (T) zzbz(t9, zzham.zzI(inputStream, 4096), zzhay.zza);
        zzf(t10);
        return t10;
    }

    public static <T extends zzhbo<T, ?>> T zzbp(T t9, ByteBuffer byteBuffer) throws zzhcd {
        return (T) zzbv(t9, byteBuffer, zzhay.zza);
    }

    public static <T extends zzhbo<T, ?>> T zzbq(T t9, byte[] bArr) throws zzhcd {
        T t10 = (T) zzi(t9, bArr, 0, bArr.length, zzhay.zza);
        zzf(t10);
        return t10;
    }

    public static <T extends zzhbo<T, ?>> T zzbr(T t9, zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        T t10 = (T) zzh(t9, zzhacVar, zzhayVar);
        zzf(t10);
        return t10;
    }

    public static <T extends zzhbo<T, ?>> T zzbs(T t9, zzham zzhamVar, zzhay zzhayVar) throws zzhcd {
        T t10 = (T) zzbz(t9, zzhamVar, zzhayVar);
        zzf(t10);
        return t10;
    }

    public static <T extends zzhbo<T, ?>> T zzbu(T t9, InputStream inputStream, zzhay zzhayVar) throws zzhcd {
        T t10 = (T) zzbz(t9, zzham.zzI(inputStream, 4096), zzhayVar);
        zzf(t10);
        return t10;
    }

    public static <T extends zzhbo<T, ?>> T zzbv(T t9, ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
        zzham zzJ;
        boolean z8 = false;
        if (byteBuffer.hasArray()) {
            zzJ = zzham.zzJ(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzhfa.zzB()) {
            zzJ = new zzhak(byteBuffer, z8, null);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzJ = zzham.zzJ(bArr, 0, remaining, true);
        }
        T t10 = (T) zzbs(t9, zzJ, zzhayVar);
        zzf(t10);
        return t10;
    }

    public static <T extends zzhbo<T, ?>> T zzbx(T t9, byte[] bArr, zzhay zzhayVar) throws zzhcd {
        T t10 = (T) zzi(t9, bArr, 0, bArr.length, zzhayVar);
        zzf(t10);
        return t10;
    }

    public static <T extends zzhbo<T, ?>> T zzby(T t9, zzham zzhamVar) throws zzhcd {
        return (T) zzbz(t9, zzhamVar, zzhay.zza);
    }

    public static <T extends zzhbo<T, ?>> T zzbz(T t9, zzham zzhamVar, zzhay zzhayVar) throws zzhcd {
        T t10 = (T) t9.zzbj();
        try {
            zzhdz zzb2 = zzhdo.zza().zzb(t10.getClass());
            zzb2.zzh(t10, zzhan.zzq(zzhamVar), zzhayVar);
            zzb2.zzf(t10);
            return t10;
        } catch (zzhcd e4) {
            e = e4;
            if (e.zzl()) {
                e = new zzhcd(e);
            }
            e.zzh(t10);
            throw e;
        } catch (zzhep e9) {
            zzhcd zza2 = e9.zza();
            zza2.zzh(t10);
            throw zza2;
        } catch (IOException e10) {
            if (e10.getCause() instanceof zzhcd) {
                throw ((zzhcd) e10.getCause());
            }
            zzhcd zzhcdVar = new zzhcd(e10);
            zzhcdVar.zzh(t10);
            throw zzhcdVar;
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof zzhcd) {
                throw ((zzhcd) e11.getCause());
            }
            throw e11;
        }
    }

    private int zzc(zzhdz<?> zzhdzVar) {
        if (zzhdzVar == null) {
            return zzhdo.zza().zzb(getClass()).zza(this);
        }
        return zzhdzVar.zza(this);
    }

    public static <T extends zzhbo> void zzca(Class<T> cls, T t9) {
        t9.zzbW();
        zzc.put(cls, t9);
    }

    public static final <T extends zzhbo<T, ?>> boolean zzcd(T t9, boolean z8) {
        T t10;
        byte byteValue = ((Byte) t9.zzbO(zzhbn.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzhdo.zza().zzb(t9.getClass()).zzl(t9);
        if (z8) {
            if (true != zzl) {
                t10 = null;
            } else {
                t10 = t9;
            }
            t9.zzbP(zzhbn.SET_MEMOIZED_IS_INITIALIZED, t10);
        }
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzhbk<MessageType, BuilderType>, BuilderType, T> zzhbm<MessageType, T> zze(zzhaw<MessageType, T> zzhawVar) {
        return (zzhbm) zzhawVar;
    }

    private static <T extends zzhbo<T, ?>> T zzf(T t9) throws zzhcd {
        if (t9 != null && !t9.zzbw()) {
            zzhcd zza2 = t9.zzaP().zza();
            zza2.zzh(t9);
            throw zza2;
        }
        return t9;
    }

    private static <T extends zzhbo<T, ?>> T zzg(T t9, InputStream inputStream, zzhay zzhayVar) throws zzhcd {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zzham zzI = zzham.zzI(new zzgzg(inputStream, zzham.zzG(read, inputStream)), 4096);
            T t10 = (T) zzbz(t9, zzI, zzhayVar);
            try {
                zzI.zzz(0);
                return t10;
            } catch (zzhcd e4) {
                e4.zzh(t10);
                throw e4;
            }
        } catch (zzhcd e9) {
            if (e9.zzl()) {
                throw new zzhcd(e9);
            }
            throw e9;
        } catch (IOException e10) {
            throw new zzhcd(e10);
        }
    }

    private static <T extends zzhbo<T, ?>> T zzh(T t9, zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        zzham zzl = zzhacVar.zzl();
        T t10 = (T) zzbz(t9, zzl, zzhayVar);
        try {
            zzl.zzz(0);
            return t10;
        } catch (zzhcd e4) {
            e4.zzh(t10);
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends zzhbo<T, ?>> T zzi(T t9, byte[] bArr, int i9, int i10, zzhay zzhayVar) throws zzhcd {
        T t10 = (T) t9.zzbj();
        try {
            zzhdz zzb2 = zzhdo.zza().zzb(t10.getClass());
            zzb2.zzi(t10, bArr, i9, i9 + i10, new zzgzn(zzhayVar));
            zzb2.zzf(t10);
            return t10;
        } catch (zzhcd e4) {
            e = e4;
            if (e.zzl()) {
                e = new zzhcd(e);
            }
            e.zzh(t10);
            throw e;
        } catch (zzhep e9) {
            zzhcd zza2 = e9.zza();
            zza2.zzh(t10);
            throw zza2;
        } catch (IOException e10) {
            if (e10.getCause() instanceof zzhcd) {
                throw ((zzhcd) e10.getCause());
            }
            zzhcd zzhcdVar = new zzhcd(e10);
            zzhcdVar.zzh(t10);
            throw zzhcdVar;
        } catch (IndexOutOfBoundsException unused) {
            zzhcd zzj = zzhcd.zzj();
            zzj.zzh(t10);
            throw zzj;
        }
    }

    private void zzj() {
        if (this.zzt == zzher.zzc()) {
            this.zzt = zzher.zzf();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhdo.zza().zzb(getClass()).zzk(this, (zzhbo) obj);
    }

    public int hashCode() {
        if (zzce()) {
            return zzaW();
        }
        if (zzcc()) {
            zzcb(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzhdg.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public int zzaL() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public int zzaM(zzhdz zzhdzVar) {
        if (zzce()) {
            int zzc2 = zzc(zzhdzVar);
            if (zzc2 >= 0) {
                return zzc2;
            }
            throw new IllegalStateException(o.h(zzc2, "serialized size must be non-negative, was "));
        }
        if (zzaL() != Integer.MAX_VALUE) {
            return zzaL();
        }
        int zzc3 = zzc(zzhdzVar);
        zzaS(zzc3);
        return zzc3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public zzhdj zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public void zzaS(int i9) {
        if (i9 >= 0) {
            this.zzd = i9 | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(o.h(i9, "serialized size must be non-negative, was "));
    }

    public int zzaW() {
        return zzhdo.zza().zzb(getClass()).zzb(this);
    }

    public int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzhde
    public int zzaY() {
        return zzaM(null);
    }

    public final <MessageType extends zzhbo<MessageType, BuilderType>, BuilderType extends zzhbi<MessageType, BuilderType>> BuilderType zzaZ() {
        return (BuilderType) zzbO(zzhbn.NEW_BUILDER);
    }

    public final zzhdm<MessageType> zzbM() {
        return (zzhdm) zzbO(zzhbn.GET_PARSER);
    }

    public Object zzbN() throws Exception {
        return zzbO(zzhbn.BUILD_MESSAGE_INFO);
    }

    public Object zzbO(zzhbn zzhbnVar) {
        return zzde(zzhbnVar, null, null);
    }

    public Object zzbP(zzhbn zzhbnVar, Object obj) {
        return zzde(zzhbnVar, obj, null);
    }

    public void zzbT() {
        this.zzq = 0;
    }

    public void zzbU() {
        zzaS(Integer.MAX_VALUE);
    }

    public void zzbV() {
        zzhdo.zza().zzb(getClass()).zzf(this);
        zzbW();
    }

    public void zzbW() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public void zzbX(int i9, zzhac zzhacVar) {
        zzj();
        zzher zzherVar = this.zzt;
        zzherVar.zzg();
        if (i9 != 0) {
            zzherVar.zzj((i9 << 3) | 2, zzhacVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void zzbY(zzher zzherVar) {
        this.zzt = zzher.zze(this.zzt, zzherVar);
    }

    public void zzbZ(int i9, int i10) {
        zzj();
        zzher zzherVar = this.zzt;
        zzherVar.zzg();
        if (i9 != 0) {
            zzherVar.zzj(i9 << 3, Long.valueOf(i10));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final <MessageType extends zzhbo<MessageType, BuilderType>, BuilderType extends zzhbi<MessageType, BuilderType>> BuilderType zzba(MessageType messagetype) {
        BuilderType zzaZ = zzaZ();
        zzaZ.zzbj(messagetype);
        return zzaZ;
    }

    @Override // com.google.android.gms.internal.ads.zzhde
    /* renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzbO(zzhbn.NEW_BUILDER);
    }

    @Override // com.google.android.gms.internal.ads.zzhde
    /* renamed from: zzbc, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcZ() {
        BuilderType buildertype = (BuilderType) zzbO(zzhbn.NEW_BUILDER);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    /* renamed from: zzbi, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbt() {
        return (MessageType) zzbO(zzhbn.GET_DEFAULT_INSTANCE);
    }

    public MessageType zzbj() {
        return (MessageType) zzbO(zzhbn.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    public final boolean zzbw() {
        return zzcd(this, true);
    }

    public void zzcb(int i9) {
        this.zzq = i9;
    }

    public boolean zzcc() {
        return zzaX() == 0;
    }

    public boolean zzce() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public boolean zzcf(int i9, zzham zzhamVar) throws IOException {
        if ((i9 & 7) == 4) {
            return false;
        }
        zzj();
        return this.zzt.zzm(i9, zzhamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhde
    public void zzda(zzhat zzhatVar) throws IOException {
        zzhdo.zza().zzb(getClass()).zzj(this, zzhau.zza(zzhatVar));
    }

    public abstract Object zzde(zzhbn zzhbnVar, Object obj, Object obj2);
}

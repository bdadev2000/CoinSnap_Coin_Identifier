package com.google.android.gms.internal.ads;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class zzfwk {
    private final String zza;
    private final zzfwj zzb;
    private zzfwj zzc;

    public /* synthetic */ zzfwk(String str, zzfwl zzfwlVar) {
        zzfwj zzfwjVar = new zzfwj();
        this.zzb = zzfwjVar;
        this.zzc = zzfwjVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        zzfwj zzfwjVar = this.zzb.zzb;
        String str = "";
        while (zzfwjVar != null) {
            Object obj = zzfwjVar.zza;
            sb2.append(str);
            if (obj != null && obj.getClass().isArray()) {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            } else {
                sb2.append(obj);
            }
            zzfwjVar = zzfwjVar.zzb;
            str = ", ";
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public final zzfwk zza(Object obj) {
        zzfwj zzfwjVar = new zzfwj();
        this.zzc.zzb = zzfwjVar;
        this.zzc = zzfwjVar;
        zzfwjVar.zza = obj;
        return this;
    }
}

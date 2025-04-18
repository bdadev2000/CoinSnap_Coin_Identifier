package com.google.android.gms.internal.ads;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
final class zzhbl {
    public static String zza(zzgxp zzgxpVar) {
        StringBuilder sb2 = new StringBuilder(zzgxpVar.zzd());
        for (int i10 = 0; i10 < zzgxpVar.zzd(); i10++) {
            byte zza = zzgxpVar.zza(i10);
            if (zza != 34) {
                if (zza != 39) {
                    if (zza != 92) {
                        switch (zza) {
                            case 7:
                                sb2.append("\\a");
                                break;
                            case 8:
                                sb2.append("\\b");
                                break;
                            case 9:
                                sb2.append("\\t");
                                break;
                            case 10:
                                sb2.append("\\n");
                                break;
                            case 11:
                                sb2.append("\\v");
                                break;
                            case 12:
                                sb2.append("\\f");
                                break;
                            case 13:
                                sb2.append("\\r");
                                break;
                            default:
                                if (zza >= 32 && zza <= 126) {
                                    sb2.append((char) zza);
                                    break;
                                } else {
                                    sb2.append(AbstractJsonLexerKt.STRING_ESC);
                                    sb2.append((char) (((zza >>> 6) & 3) + 48));
                                    sb2.append((char) (((zza >>> 3) & 7) + 48));
                                    sb2.append((char) ((zza & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }
}

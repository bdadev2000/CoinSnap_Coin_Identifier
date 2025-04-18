package com.google.android.gms.internal.play_billing;

import androidx.compose.foundation.text.input.a;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzge {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzgc zzgcVar, String str) {
        StringBuilder B = a.B("# ", str);
        zzd(zzgcVar, B, 0);
        return B.toString();
    }

    public static void zzb(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i2, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i3 = 1; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzhb.zza(new zzdt(((String) obj).getBytes(zzfd.zzb))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzdw) {
            sb.append(": \"");
            sb.append(zzhb.zza((zzdw) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzex) {
            sb.append(" {");
            zzd((zzex) obj, sb, i2 + 2);
            sb.append("\n");
            zzc(i2, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i4 = i2 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i4, SDKConstants.PARAM_KEY, entry.getKey());
        zzb(sb, i4, "value", entry.getValue());
        sb.append("\n");
        zzc(i2, sb);
        sb.append("}");
    }

    private static void zzc(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(zza, 0, i3);
            i2 -= i3;
        }
    }

    private static void zzd(zzgc zzgcVar, StringBuilder sb, int i2) {
        int i3;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzgcVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i3 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i3);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i2, substring.substring(0, substring.length() - 4), zzex.zzl(method2, zzgcVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i2, substring.substring(0, substring.length() - 3), zzex.zzl(method, zzgcVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzl = zzex.zzl(method4, zzgcVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zzex.zzl(method5, zzgcVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i2, substring, zzl);
                    } else if (zzl instanceof Boolean) {
                        if (!((Boolean) zzl).booleanValue()) {
                        }
                        zzb(sb, i2, substring, zzl);
                    } else if (zzl instanceof Integer) {
                        if (((Integer) zzl).intValue() == 0) {
                        }
                        zzb(sb, i2, substring, zzl);
                    } else if (zzl instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) zzl).floatValue()) == 0) {
                        }
                        zzb(sb, i2, substring, zzl);
                    } else if (zzl instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) zzl).doubleValue()) == 0) {
                        }
                        zzb(sb, i2, substring, zzl);
                    } else {
                        if (zzl instanceof String) {
                            equals = zzl.equals("");
                        } else if (zzl instanceof zzdw) {
                            equals = zzl.equals(zzdw.zzb);
                        } else if (zzl instanceof zzgc) {
                            if (zzl == ((zzgc) zzl).zzf()) {
                            }
                            zzb(sb, i2, substring, zzl);
                        } else {
                            if ((zzl instanceof Enum) && ((Enum) zzl).ordinal() == 0) {
                            }
                            zzb(sb, i2, substring, zzl);
                        }
                        if (equals) {
                        }
                        zzb(sb, i2, substring, zzl);
                    }
                }
            }
            i3 = 3;
        }
        if (zzgcVar instanceof zzeu) {
            throw null;
        }
        zzhe zzheVar = ((zzex) zzgcVar).zzc;
        if (zzheVar != null) {
            zzheVar.zzi(sb, i2);
        }
    }
}

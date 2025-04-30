package com.google.android.gms.internal.ads;

import Q7.n0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import z.AbstractC2965e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhdg {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzhde zzhdeVar, String str) {
        StringBuilder c9 = AbstractC2965e.c("# ", str);
        zzd(zzhdeVar, c9, 0);
        return c9.toString();
    }

    public static void zzb(StringBuilder sb, int i9, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i9, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i9, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i9, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
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
            sb.append(zzheo.zza(zzhac.zzw((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzhac) {
            sb.append(": \"");
            sb.append(zzheo.zza((zzhac) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzhbo) {
            sb.append(" {");
            zzd((zzhbo) obj, sb, i9 + 2);
            sb.append("\n");
            zzc(i9, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            int i11 = i9 + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            zzb(sb, i11, "key", entry.getKey());
            zzb(sb, i11, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb.append("\n");
            zzc(i9, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    private static void zzc(int i9, StringBuilder sb) {
        while (i9 > 0) {
            int i10 = 80;
            if (i9 <= 80) {
                i10 = i9;
            }
            sb.append(zza, 0, i10);
            i9 -= i10;
        }
    }

    private static void zzd(zzhde zzhdeVar, StringBuilder sb, int i9) {
        int i10;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzhdeVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i10 = 3;
            if (i11 >= length) {
                break;
            }
            Method method3 = declaredMethods[i11];
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
            i11++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i9, substring.substring(0, substring.length() - 4), zzhbo.zzbQ(method2, zzhdeVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i9, substring.substring(0, substring.length() - 3), zzhbo.zzbQ(method, zzhdeVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzbQ = zzhbo.zzbQ(method4, zzhdeVar, new Object[0]);
                    if (method5 == null) {
                        if (zzbQ instanceof Boolean) {
                            if (!((Boolean) zzbQ).booleanValue()) {
                            }
                            zzb(sb, i9, substring, zzbQ);
                        } else if (zzbQ instanceof Integer) {
                            if (((Integer) zzbQ).intValue() == 0) {
                            }
                            zzb(sb, i9, substring, zzbQ);
                        } else if (zzbQ instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzbQ).floatValue()) == 0) {
                            }
                            zzb(sb, i9, substring, zzbQ);
                        } else if (zzbQ instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzbQ).doubleValue()) == 0) {
                            }
                            zzb(sb, i9, substring, zzbQ);
                        } else {
                            if (zzbQ instanceof String) {
                                equals = zzbQ.equals("");
                            } else if (zzbQ instanceof zzhac) {
                                equals = zzbQ.equals(zzhac.zzb);
                            } else if (zzbQ instanceof zzhde) {
                                if (zzbQ == ((zzhde) zzbQ).zzbt()) {
                                }
                                zzb(sb, i9, substring, zzbQ);
                            } else {
                                if ((zzbQ instanceof Enum) && ((Enum) zzbQ).ordinal() == 0) {
                                }
                                zzb(sb, i9, substring, zzbQ);
                            }
                            if (equals) {
                            }
                            zzb(sb, i9, substring, zzbQ);
                        }
                    } else {
                        if (!((Boolean) zzhbo.zzbQ(method5, zzhdeVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i9, substring, zzbQ);
                    }
                }
            }
            i10 = 3;
        }
        if (zzhdeVar instanceof zzhbk) {
            Iterator zzg = ((zzhbk) zzhdeVar).zza.zzg();
            while (zzg.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzg.next();
                zzb(sb, i9, n0.f(((zzhbl) entry2.getKey()).zzb, "[", "]"), entry2.getValue());
            }
        }
        zzher zzherVar = ((zzhbo) zzhdeVar).zzt;
        if (zzherVar != null) {
            zzherVar.zzi(sb, i9);
        }
    }
}

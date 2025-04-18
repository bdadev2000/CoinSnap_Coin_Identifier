package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes4.dex */
final class MessageLiteToString {
    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static final void b(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            ByteString byteString = ByteString.f19122b;
            sb.append(TextFormatEscaper.a(new ByteString.LiteralByteString(((String) obj).getBytes(Internal.f19251a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(TextFormatEscaper.a((ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            c((GeneratedMessageLite) obj, sb, i2 + 2);
            sb.append("\n");
            while (i3 < i2) {
                sb.append(' ');
                i3++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i2 + 2;
        b(sb, i5, SDKConstants.PARAM_KEY, entry.getKey());
        b(sb, i5, "value", entry.getValue());
        sb.append("\n");
        while (i3 < i2) {
            sb.append(' ');
            i3++;
        }
        sb.append("}");
    }

    public static void c(MessageLite messageLite, StringBuilder sb, int i2) {
        boolean z2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (java.lang.reflect.Method method : messageLite.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String replaceFirst = str.replaceFirst("get", "");
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                java.lang.reflect.Method method2 = (java.lang.reflect.Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i2, a(str2), GeneratedMessageLite.p(method2, messageLite, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                java.lang.reflect.Method method3 = (java.lang.reflect.Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i2, a(str3), GeneratedMessageLite.p(method3, messageLite, new Object[0]));
                }
            }
            if (((java.lang.reflect.Method) hashMap2.get("set".concat(replaceFirst))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) hashMap.get("get".concat(replaceFirst));
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has".concat(replaceFirst));
                if (method4 != null) {
                    Object p2 = GeneratedMessageLite.p(method4, messageLite, new Object[0]);
                    if (method5 == null) {
                        if (p2 instanceof Boolean) {
                            z2 = !((Boolean) p2).booleanValue();
                        } else if (p2 instanceof Integer) {
                            if (((Integer) p2).intValue() != 0) {
                                b(sb, i2, a(str4), p2);
                            }
                        } else if (p2 instanceof Float) {
                            if (((Float) p2).floatValue() != 0.0f) {
                                b(sb, i2, a(str4), p2);
                            }
                        } else if (p2 instanceof Double) {
                            if (((Double) p2).doubleValue() != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                b(sb, i2, a(str4), p2);
                            }
                        } else if (p2 instanceof String) {
                            z2 = p2.equals("");
                        } else if (p2 instanceof ByteString) {
                            z2 = p2.equals(ByteString.f19122b);
                        } else if (!(p2 instanceof MessageLite)) {
                            if ((p2 instanceof java.lang.Enum) && ((java.lang.Enum) p2).ordinal() == 0) {
                            }
                            b(sb, i2, a(str4), p2);
                        } else if (p2 != ((MessageLite) p2).f()) {
                            b(sb, i2, a(str4), p2);
                        }
                        if (!z2) {
                            b(sb, i2, a(str4), p2);
                        }
                    } else if (((Boolean) GeneratedMessageLite.p(method5, messageLite, new Object[0])).booleanValue()) {
                        b(sb, i2, a(str4), p2);
                    }
                }
            }
        }
        if (messageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator k2 = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.k();
            while (k2.hasNext()) {
                Map.Entry entry = (Map.Entry) k2.next();
                ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).getClass();
                b(sb, i2, "[0]", entry.getValue());
            }
        }
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) messageLite).unknownFields;
        if (unknownFieldSetLite != null) {
            for (int i3 = 0; i3 < unknownFieldSetLite.f19383a; i3++) {
                b(sb, i2, String.valueOf(unknownFieldSetLite.f19384b[i3] >>> 3), unknownFieldSetLite.f19385c[i3]);
            }
        }
    }
}

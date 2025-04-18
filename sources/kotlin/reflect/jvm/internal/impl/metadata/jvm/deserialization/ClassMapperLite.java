package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import eb.j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;
import vd.e;

/* loaded from: classes4.dex */
public final class ClassMapperLite {
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* renamed from: kotlin, reason: collision with root package name */
    private static final String f21060kotlin;
    private static final Map<String, String> map;

    static {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);
        f21060kotlin = joinToString$default;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listOf = CollectionsKt.listOf((Object[]) new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D"});
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, listOf.size() - 1, 2);
        if (progressionLastElement >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f21060kotlin;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listOf.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listOf.get(i11));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(e.h(sb3, (String) listOf.get(i10), "Array"), "[" + ((String) listOf.get(i11)));
                if (i10 == progressionLastElement) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f21060kotlin + "/Unit", "V");
        map$lambda$0$add(linkedHashMap, "Any", "java/lang/Object");
        map$lambda$0$add(linkedHashMap, "Nothing", "java/lang/Void");
        map$lambda$0$add(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            map$lambda$0$add(linkedHashMap, str2, e.e("java/lang/", str2));
        }
        for (String str3 : CollectionsKt.listOf((Object[]) new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            map$lambda$0$add(linkedHashMap, e.e("collections/", str3), e.e("java/util/", str3));
            map$lambda$0$add(linkedHashMap, e.e("collections/Mutable", str3), e.e("java/util/", str3));
        }
        map$lambda$0$add(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        map$lambda$0$add(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            String i13 = j.i("Function", i12);
            StringBuilder sb4 = new StringBuilder();
            String str4 = f21060kotlin;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i12);
            map$lambda$0$add(linkedHashMap, i13, sb4.toString());
            map$lambda$0$add(linkedHashMap, j.i("reflect/KFunction", i12), j.k(str4, "/reflect/KFunction"));
        }
        for (String str5 : CollectionsKt.listOf((Object[]) new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            map$lambda$0$add(linkedHashMap, j.k(str5, ".Companion"), a4.j.k(new StringBuilder(), f21060kotlin, "/jvm/internal/", str5, "CompanionObject"));
        }
        map = linkedHashMap;
    }

    private ClassMapperLite() {
    }

    private static final void map$lambda$0$add(Map<String, String> map2, String str, String str2) {
        map2.put(f21060kotlin + '/' + str, "L" + str2 + ';');
    }

    @JvmStatic
    public static final String mapClass(String classId) {
        String replace$default;
        Intrinsics.checkNotNullParameter(classId, "classId");
        String str = map.get(classId);
        if (str == null) {
            StringBuilder sb2 = new StringBuilder("L");
            replace$default = StringsKt__StringsJVMKt.replace$default(classId, '.', Typography.dollar, false, 4, (Object) null);
            sb2.append(replace$default);
            sb2.append(';');
            return sb2.toString();
        }
        return str;
    }
}

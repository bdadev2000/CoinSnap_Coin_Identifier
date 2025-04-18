package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension({"SMAP\nBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,42:1\n1549#2:43\n1620#2,3:44\n1490#2:47\n1520#2,3:48\n1523#2,3:58\n1238#2,4:63\n1549#2:67\n1620#2,3:68\n361#3,7:51\n442#3:61\n392#3:62\n*S KotlinDebug\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n*L\n27#1:43\n27#1:44,3\n28#1:47\n28#1:48,3\n28#1:58,3\n29#1:63,4\n34#1:67\n34#1:68,3\n28#1:51,7\n29#1:61\n29#1:62\n*E\n"})
/* loaded from: classes4.dex */
public final class BuiltinSpecialProperties {
    private static final Map<Name, List<Name>> GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP;
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();
    private static final Map<FqName, Name> PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
    private static final Set<FqName> SPECIAL_FQ_NAMES;
    private static final Set<Name> SPECIAL_SHORT_NAMES;

    static {
        FqName childSafe;
        FqName childSafe2;
        FqName child;
        FqName child2;
        FqName childSafe3;
        FqName child3;
        FqName child4;
        FqName child5;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames._enum;
        childSafe = BuiltinSpecialPropertiesKt.childSafe(fqNameUnsafe, "name");
        childSafe2 = BuiltinSpecialPropertiesKt.childSafe(fqNameUnsafe, "ordinal");
        child = BuiltinSpecialPropertiesKt.child(StandardNames.FqNames.collection, "size");
        FqName fqName = StandardNames.FqNames.map;
        child2 = BuiltinSpecialPropertiesKt.child(fqName, "size");
        childSafe3 = BuiltinSpecialPropertiesKt.childSafe(StandardNames.FqNames.charSequence, "length");
        child3 = BuiltinSpecialPropertiesKt.child(fqName, "keys");
        child4 = BuiltinSpecialPropertiesKt.child(fqName, "values");
        child5 = BuiltinSpecialPropertiesKt.child(fqName, "entries");
        Map<FqName, Name> mapOf = MapsKt.mapOf(TuplesKt.to(childSafe, Name.identifier("name")), TuplesKt.to(childSafe2, Name.identifier("ordinal")), TuplesKt.to(child, Name.identifier("size")), TuplesKt.to(child2, Name.identifier("size")), TuplesKt.to(childSafe3, Name.identifier("length")), TuplesKt.to(child3, Name.identifier("keySet")), TuplesKt.to(child4, Name.identifier("values")), TuplesKt.to(child5, Name.identifier("entrySet")));
        PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP = mapOf;
        Set<Map.Entry<FqName, Name>> entrySet = mapOf.entrySet();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            Name name = (Name) pair.getSecond();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add((Name) pair.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt.distinct((Iterable) entry2.getValue()));
        }
        GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP = linkedHashMap2;
        Set<FqName> keySet = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.keySet();
        SPECIAL_FQ_NAMES = keySet;
        Set<FqName> set = keySet;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator<T> it3 = set.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((FqName) it3.next()).shortName());
        }
        SPECIAL_SHORT_NAMES = CollectionsKt.toSet(arrayList2);
    }

    private BuiltinSpecialProperties() {
    }

    public final Map<FqName, Name> getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
    }

    public final List<Name> getPropertyNameCandidatesBySpecialGetterName(Name name1) {
        Intrinsics.checkNotNullParameter(name1, "name1");
        List<Name> list = GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP.get(name1);
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        return list;
    }

    public final Set<FqName> getSPECIAL_FQ_NAMES() {
        return SPECIAL_FQ_NAMES;
    }

    public final Set<Name> getSPECIAL_SHORT_NAMES() {
        return SPECIAL_SHORT_NAMES;
    }
}

package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import eb.j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;

@SourceDebugExtension({"SMAP\nJvmNameResolverBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1208#2,2:107\n1238#2,4:109\n*S KotlinDebug\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n*L\n101#1:107,2\n101#1:109,4\n*E\n"})
/* loaded from: classes4.dex */
public class JvmNameResolverBase implements NameResolver {
    public static final Companion Companion = new Companion(null);
    private static final List<String> PREDEFINED_STRINGS;
    private static final Map<String, Integer> PREDEFINED_STRINGS_MAP;

    /* renamed from: kotlin, reason: collision with root package name */
    private static final String f21061kotlin;
    private final Set<Integer> localNameIndices;
    private final List<JvmProtoBuf.StringTableTypes.Record> records;
    private final String[] strings;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String joinToString$default;
        int collectionSizeOrDefault;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);
        f21061kotlin = joinToString$default;
        List<String> listOf = CollectionsKt.listOf((Object[]) new String[]{j.k(joinToString$default, "/Any"), j.k(joinToString$default, "/Nothing"), j.k(joinToString$default, "/Unit"), j.k(joinToString$default, "/Throwable"), j.k(joinToString$default, "/Number"), j.k(joinToString$default, "/Byte"), j.k(joinToString$default, "/Double"), j.k(joinToString$default, "/Float"), j.k(joinToString$default, "/Int"), j.k(joinToString$default, "/Long"), j.k(joinToString$default, "/Short"), j.k(joinToString$default, "/Boolean"), j.k(joinToString$default, "/Char"), j.k(joinToString$default, "/CharSequence"), j.k(joinToString$default, "/String"), j.k(joinToString$default, "/Comparable"), j.k(joinToString$default, "/Enum"), j.k(joinToString$default, "/Array"), j.k(joinToString$default, "/ByteArray"), j.k(joinToString$default, "/DoubleArray"), j.k(joinToString$default, "/FloatArray"), j.k(joinToString$default, "/IntArray"), j.k(joinToString$default, "/LongArray"), j.k(joinToString$default, "/ShortArray"), j.k(joinToString$default, "/BooleanArray"), j.k(joinToString$default, "/CharArray"), j.k(joinToString$default, "/Cloneable"), j.k(joinToString$default, "/Annotation"), j.k(joinToString$default, "/collections/Iterable"), j.k(joinToString$default, "/collections/MutableIterable"), j.k(joinToString$default, "/collections/Collection"), j.k(joinToString$default, "/collections/MutableCollection"), j.k(joinToString$default, "/collections/List"), j.k(joinToString$default, "/collections/MutableList"), j.k(joinToString$default, "/collections/Set"), j.k(joinToString$default, "/collections/MutableSet"), j.k(joinToString$default, "/collections/Map"), j.k(joinToString$default, "/collections/MutableMap"), j.k(joinToString$default, "/collections/Map.Entry"), j.k(joinToString$default, "/collections/MutableMap.MutableEntry"), j.k(joinToString$default, "/collections/Iterator"), j.k(joinToString$default, "/collections/MutableIterator"), j.k(joinToString$default, "/collections/ListIterator"), j.k(joinToString$default, "/collections/MutableListIterator")});
        PREDEFINED_STRINGS = listOf;
        Iterable<IndexedValue> withIndex = CollectionsKt.withIndex(listOf);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(withIndex, 10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
        for (IndexedValue indexedValue : withIndex) {
            linkedHashMap.put((String) indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
        }
        PREDEFINED_STRINGS_MAP = linkedHashMap;
    }

    public JvmNameResolverBase(String[] strings, Set<Integer> localNameIndices, List<JvmProtoBuf.StringTableTypes.Record> records) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(localNameIndices, "localNameIndices");
        Intrinsics.checkNotNullParameter(records, "records");
        this.strings = strings;
        this.localNameIndices = localNameIndices;
        this.records = records;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getQualifiedClassName(int i10) {
        return getString(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getString(int i10) {
        String string;
        boolean z10;
        JvmProtoBuf.StringTableTypes.Record record = this.records.get(i10);
        if (record.hasString()) {
            string = record.getString();
        } else {
            if (record.hasPredefinedIndex()) {
                List<String> list = PREDEFINED_STRINGS;
                int size = list.size();
                int predefinedIndex = record.getPredefinedIndex();
                if (predefinedIndex >= 0 && predefinedIndex < size) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    string = list.get(record.getPredefinedIndex());
                }
            }
            string = this.strings[i10];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            Intrinsics.checkNotNullExpressionValue(substringIndexList, "substringIndexList");
            Integer begin = substringIndexList.get(0);
            Integer end = substringIndexList.get(1);
            Intrinsics.checkNotNullExpressionValue(begin, "begin");
            if (begin.intValue() >= 0) {
                int intValue = begin.intValue();
                Intrinsics.checkNotNullExpressionValue(end, "end");
                if (intValue <= end.intValue() && end.intValue() <= string.length()) {
                    Intrinsics.checkNotNullExpressionValue(string, "string");
                    string = string.substring(begin.intValue(), end.intValue());
                    Intrinsics.checkNotNullExpressionValue(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            Intrinsics.checkNotNullExpressionValue(replaceCharList, "replaceCharList");
            Integer num = replaceCharList.get(0);
            Integer num2 = replaceCharList.get(1);
            Intrinsics.checkNotNullExpressionValue(string, "string");
            string = StringsKt__StringsJVMKt.replace$default(string, (char) num.intValue(), (char) num2.intValue(), false, 4, (Object) null);
        }
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i11 != 2) {
            if (i11 == 3) {
                if (string.length() >= 2) {
                    Intrinsics.checkNotNullExpressionValue(string, "string");
                    string = string.substring(1, string.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                Intrinsics.checkNotNullExpressionValue(string, "string");
                string = StringsKt__StringsJVMKt.replace$default(string, Typography.dollar, '.', false, 4, (Object) null);
            }
        } else {
            Intrinsics.checkNotNullExpressionValue(string, "string");
            string = StringsKt__StringsJVMKt.replace$default(string, Typography.dollar, '.', false, 4, (Object) null);
        }
        Intrinsics.checkNotNullExpressionValue(string, "string");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i10) {
        return this.localNameIndices.contains(Integer.valueOf(i10));
    }
}

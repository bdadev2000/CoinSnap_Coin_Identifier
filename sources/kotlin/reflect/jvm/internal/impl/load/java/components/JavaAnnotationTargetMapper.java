package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationTargetMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n800#2,11:183\n1360#2:194\n1446#2,5:195\n1549#2:200\n1620#2,3:201\n*S KotlinDebug\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationTargetMapper\n*L\n153#1:183,11\n154#1:194\n154#1:195,5\n155#1:200\n155#1:201,3\n*E\n"})
/* loaded from: classes4.dex */
public final class JavaAnnotationTargetMapper {
    public static final JavaAnnotationTargetMapper INSTANCE = new JavaAnnotationTargetMapper();
    private static final Map<String, EnumSet<KotlinTarget>> targetNameLists = MapsKt.mapOf(TuplesKt.to("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), TuplesKt.to("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), TuplesKt.to("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), TuplesKt.to("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), TuplesKt.to("FIELD", EnumSet.of(KotlinTarget.FIELD)), TuplesKt.to("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), TuplesKt.to("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), TuplesKt.to("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), TuplesKt.to("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), TuplesKt.to("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));
    private static final Map<String, KotlinRetention> retentionNameList = MapsKt.mapOf(TuplesKt.to("RUNTIME", KotlinRetention.RUNTIME), TuplesKt.to("CLASS", KotlinRetention.BINARY), TuplesKt.to("SOURCE", KotlinRetention.SOURCE));

    private JavaAnnotationTargetMapper() {
    }

    public final ConstantValue<?> mapJavaRetentionArgument$descriptors_jvm(JavaAnnotationArgument javaAnnotationArgument) {
        JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument;
        String str;
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
        } else {
            javaEnumValueAnnotationArgument = null;
        }
        if (javaEnumValueAnnotationArgument == null) {
            return null;
        }
        Map<String, KotlinRetention> map = retentionNameList;
        Name entryName = javaEnumValueAnnotationArgument.getEntryName();
        if (entryName != null) {
            str = entryName.asString();
        } else {
            str = null;
        }
        KotlinRetention kotlinRetention = map.get(str);
        if (kotlinRetention == null) {
            return null;
        }
        ClassId classId = ClassId.topLevel(StandardNames.FqNames.annotationRetention);
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(StandardNames.F…ames.annotationRetention)");
        Name identifier = Name.identifier(kotlinRetention.name());
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(retention.name)");
        return new EnumValue(classId, identifier);
    }

    public final Set<KotlinTarget> mapJavaTargetArgumentByName(String str) {
        EnumSet<KotlinTarget> enumSet = targetNameLists.get(str);
        return enumSet != null ? enumSet : SetsKt.emptySet();
    }

    public final ConstantValue<?> mapJavaTargetArguments$descriptors_jvm(List<? extends JavaAnnotationArgument> arguments) {
        int collectionSizeOrDefault;
        String str;
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof JavaEnumValueAnnotationArgument) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) it.next();
            JavaAnnotationTargetMapper javaAnnotationTargetMapper = INSTANCE;
            Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            if (entryName != null) {
                str = entryName.asString();
            } else {
                str = null;
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, javaAnnotationTargetMapper.mapJavaTargetArgumentByName(str));
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            KotlinTarget kotlinTarget = (KotlinTarget) it2.next();
            ClassId classId = ClassId.topLevel(StandardNames.FqNames.annotationTarget);
            Intrinsics.checkNotNullExpressionValue(classId, "topLevel(StandardNames.FqNames.annotationTarget)");
            Name identifier = Name.identifier(kotlinTarget.name());
            Intrinsics.checkNotNullExpressionValue(identifier, "identifier(kotlinTarget.name)");
            arrayList3.add(new EnumValue(classId, identifier));
        }
        return new ArrayValue(arrayList3, new Function1<ModuleDescriptor, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper$mapJavaTargetArguments$1
            @Override // kotlin.jvm.functions.Function1
            public final KotlinType invoke(ModuleDescriptor module) {
                Intrinsics.checkNotNullParameter(module, "module");
                ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), module.getBuiltIns().getBuiltInClassByFqName(StandardNames.FqNames.target));
                KotlinType type = annotationParameterByName != null ? annotationParameterByName.getType() : null;
                return type == null ? ErrorUtils.createErrorType(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
            }
        });
    }
}

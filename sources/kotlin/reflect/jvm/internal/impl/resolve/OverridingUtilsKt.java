package kotlin.reflect.jvm.internal.impl.resolve;

import a0.a;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

@SourceDebugExtension({"SMAP\noverridingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1620#2,3:85\n847#2,2:88\n*S KotlinDebug\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n*L\n40#1:85,3\n72#1:88,2\n*E\n"})
/* loaded from: classes4.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(Collection<? extends H> collection, Function1<? super H, ? extends CallableDescriptor> descriptorByHandle) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet create = SmartSet.Companion.create();
        while (!linkedList.isEmpty()) {
            Object first = CollectionsKt.first((List<? extends Object>) linkedList);
            final SmartSet create2 = SmartSet.Companion.create();
            Collection<a> extractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(first, linkedList, descriptorByHandle, new Function1<H, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2((OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1<H>) obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(H it) {
                    SmartSet<H> smartSet = create2;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    smartSet.add(it);
                }
            });
            Intrinsics.checkNotNullExpressionValue(extractMembersOverridableInBothWays, "conflictedHandles = Smar…nflictedHandles.add(it) }");
            if (extractMembersOverridableInBothWays.size() == 1 && create2.isEmpty()) {
                Object single = CollectionsKt.single(extractMembersOverridableInBothWays);
                Intrinsics.checkNotNullExpressionValue(single, "overridableGroup.single()");
                create.add(single);
            } else {
                a aVar = (Object) OverridingUtil.selectMostSpecificMember(extractMembersOverridableInBothWays, descriptorByHandle);
                Intrinsics.checkNotNullExpressionValue(aVar, "selectMostSpecificMember…roup, descriptorByHandle)");
                CallableDescriptor invoke = descriptorByHandle.invoke(aVar);
                for (a it : extractMembersOverridableInBothWays) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    if (!OverridingUtil.isMoreSpecific(invoke, descriptorByHandle.invoke(it))) {
                        create2.add(it);
                    }
                }
                if (!create2.isEmpty()) {
                    create.addAll(create2);
                }
                create.add(aVar);
            }
        }
        return create;
    }
}

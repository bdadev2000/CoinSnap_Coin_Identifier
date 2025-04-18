package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes4.dex */
public final class NameResolverImpl implements NameResolver {
    private final ProtoBuf.QualifiedNameTable qualifiedNames;
    private final ProtoBuf.StringTable strings;

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NameResolverImpl(ProtoBuf.StringTable strings, ProtoBuf.QualifiedNameTable qualifiedNames) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(qualifiedNames, "qualifiedNames");
        this.strings = strings;
        this.qualifiedNames = qualifiedNames;
    }

    private final Triple<List<String>, List<String>, Boolean> traverseIds(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = this.qualifiedNames.getQualifiedName(i10);
            String string = this.strings.getString(qualifiedName.getShortName());
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            Intrinsics.checkNotNull(kind);
            int i11 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        linkedList2.addFirst(string);
                        z10 = true;
                    }
                } else {
                    linkedList.addFirst(string);
                }
            } else {
                linkedList2.addFirst(string);
            }
            i10 = qualifiedName.getParentQualifiedName();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getQualifiedClassName(int i10) {
        String joinToString$default;
        String joinToString$default2;
        Triple<List<String>, List<String>, Boolean> traverseIds = traverseIds(i10);
        List<String> component1 = traverseIds.component1();
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(traverseIds.component2(), ".", null, null, 0, null, null, 62, null);
        if (!component1.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            joinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(component1, "/", null, null, 0, null, null, 62, null);
            sb2.append(joinToString$default2);
            sb2.append('/');
            sb2.append(joinToString$default);
            return sb2.toString();
        }
        return joinToString$default;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getString(int i10) {
        String string = this.strings.getString(i10);
        Intrinsics.checkNotNullExpressionValue(string, "strings.getString(index)");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i10) {
        return traverseIds(i10).getThird().booleanValue();
    }
}

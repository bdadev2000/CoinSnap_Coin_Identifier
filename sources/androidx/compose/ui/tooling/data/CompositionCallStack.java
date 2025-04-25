package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.unit.IntRect;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SlotTree.jvm.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BC\u0012&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\u0010\u000bJ\u0012\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\tH\u0002J$\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00152\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000000J\u0010\u00101\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u0005H\u0002J\u0012\u00102\u001a\u0004\u0018\u00010\u00052\u0006\u00103\u001a\u00020\u0015H\u0002J\b\u00104\u001a\u00020\u0005H\u0002J\u0010\u00105\u001a\u0002062\u0006\u0010-\u001a\u00020\u0005H\u0002R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R.\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Landroidx/compose/ui/tooling/data/CompositionCallStack;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/tooling/data/SourceContext;", "factory", "Lkotlin/Function3;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "contexts", "", "", "", "(Lkotlin/jvm/functions/Function3;Ljava/util/Map;)V", "<set-?>", "Landroidx/compose/ui/unit/IntRect;", "bounds", "getBounds", "()Landroidx/compose/ui/unit/IntRect;", "current", "getCurrent", "()Landroidx/compose/runtime/tooling/CompositionGroup;", "currentCallIndex", "", "depth", "getDepth", "()I", "isInline", "", "()Z", FirebaseAnalytics.Param.LOCATION, "Landroidx/compose/ui/tooling/data/SourceLocation;", "getLocation", "()Landroidx/compose/ui/tooling/data/SourceLocation;", "name", "getName", "()Ljava/lang/String;", "parameters", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "getParameters", "()Ljava/util/List;", "stack", "Lkotlin/collections/ArrayDeque;", "contextOf", "Landroidx/compose/ui/tooling/data/SourceInformationContext;", TtmlNode.TAG_INFORMATION, "convert", "group", "callIndex", "out", "", "isCall", "parentGroup", "parentDepth", "pop", Constants.PUSH, "", "ui-tooling-data_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class CompositionCallStack<T> implements SourceContext {
    private final Map<String, Object> contexts;
    private int currentCallIndex;
    private final Function3<CompositionGroup, SourceContext, List<? extends T>, T> factory;
    private final ArrayDeque<CompositionGroup> stack = new ArrayDeque<>();
    private IntRect bounds = SlotTreeKt.getEmptyBox();

    /* JADX WARN: Multi-variable type inference failed */
    public CompositionCallStack(Function3<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? extends T> function3, Map<String, Object> map) {
        this.factory = function3;
        this.contexts = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        r2 = androidx.compose.ui.tooling.data.SlotTreeKt.boundsOfLayoutNode(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.unit.IntRect convert(androidx.compose.runtime.tooling.CompositionGroup r7, int r8, java.util.List<T> r9) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            androidx.compose.ui.unit.IntRect r1 = androidx.compose.ui.tooling.data.SlotTreeKt.getEmptyBox()
            r6.push(r7)
            java.lang.Iterable r2 = r7.getCompositionGroups()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L17:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r4 = r2.next()
            androidx.compose.runtime.tooling.CompositionGroup r4 = (androidx.compose.runtime.tooling.CompositionGroup) r4
            androidx.compose.ui.unit.IntRect r5 = r6.convert(r4, r3, r0)
            androidx.compose.ui.unit.IntRect r1 = androidx.compose.ui.tooling.data.SlotTreeKt.union(r1, r5)
            boolean r4 = r6.isCall(r4)
            if (r4 == 0) goto L17
            int r3 = r3 + 1
            goto L17
        L34:
            java.lang.Object r2 = r7.getNode()
            boolean r3 = r2 instanceof androidx.compose.ui.layout.LayoutInfo
            if (r3 == 0) goto L3f
            androidx.compose.ui.layout.LayoutInfo r2 = (androidx.compose.ui.layout.LayoutInfo) r2
            goto L40
        L3f:
            r2 = 0
        L40:
            if (r2 == 0) goto L4a
            androidx.compose.ui.unit.IntRect r2 = androidx.compose.ui.tooling.data.SlotTreeKt.access$boundsOfLayoutNode(r2)
            if (r2 != 0) goto L49
            goto L4a
        L49:
            r1 = r2
        L4a:
            r6.currentCallIndex = r8
            r6.bounds = r1
            kotlin.jvm.functions.Function3<androidx.compose.runtime.tooling.CompositionGroup, androidx.compose.ui.tooling.data.SourceContext, java.util.List<? extends T>, T> r8 = r6.factory
            java.lang.Object r7 = r8.invoke(r7, r6, r0)
            if (r7 == 0) goto L59
            r9.add(r7)
        L59:
            r6.pop()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.data.CompositionCallStack.convert(androidx.compose.runtime.tooling.CompositionGroup, int, java.util.List):androidx.compose.ui.unit.IntRect");
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public String getName() {
        int i;
        String sourceInfo = getCurrent().getSourceInfo();
        if (sourceInfo == null) {
            return null;
        }
        if (StringsKt.startsWith$default(sourceInfo, "CC(", false, 2, (Object) null)) {
            i = 3;
        } else {
            if (!StringsKt.startsWith$default(sourceInfo, "C(", false, 2, (Object) null)) {
                return null;
            }
            i = 2;
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) sourceInfo, ')', 0, false, 6, (Object) null);
        if (indexOf$default <= 2) {
            return null;
        }
        String substring = sourceInfo.substring(i, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public boolean isInline() {
        String sourceInfo = getCurrent().getSourceInfo();
        return sourceInfo != null && StringsKt.startsWith$default(sourceInfo, "CC", false, 2, (Object) null);
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public IntRect getBounds() {
        return this.bounds;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public SourceLocation getLocation() {
        String sourceInfo;
        SourceInformationContext contextOf;
        String sourceInfo2;
        CompositionGroup parentGroup = parentGroup(1);
        if (parentGroup == null || (sourceInfo = parentGroup.getSourceInfo()) == null || (contextOf = contextOf(sourceInfo)) == null) {
            return null;
        }
        int i = 2;
        SourceInformationContext sourceInformationContext = contextOf;
        while (i < this.stack.size()) {
            if ((sourceInformationContext != null ? sourceInformationContext.getSourceFile() : null) != null) {
                break;
            }
            int i2 = i + 1;
            CompositionGroup parentGroup2 = parentGroup(i);
            sourceInformationContext = (parentGroup2 == null || (sourceInfo2 = parentGroup2.getSourceInfo()) == null) ? null : contextOf(sourceInfo2);
            i = i2;
        }
        return contextOf.sourceLocation(this.currentCallIndex, sourceInformationContext);
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public List<ParameterInformation> getParameters() {
        SourceInformationContext contextOf;
        List<ParameterInformation> extractParameterInfo;
        CompositionGroup current = getCurrent();
        String sourceInfo = current.getSourceInfo();
        if (sourceInfo == null || (contextOf = contextOf(sourceInfo)) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, current.getData());
        extractParameterInfo = SlotTreeKt.extractParameterInfo(arrayList, contextOf);
        return extractParameterInfo;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public int getDepth() {
        return this.stack.size();
    }

    private final void push(CompositionGroup group) {
        this.stack.addLast(group);
    }

    private final CompositionGroup pop() {
        return this.stack.removeLast();
    }

    private final CompositionGroup getCurrent() {
        return this.stack.last();
    }

    private final CompositionGroup parentGroup(int parentDepth) {
        if (this.stack.size() <= parentDepth) {
            return null;
        }
        return this.stack.get((r0.size() - parentDepth) - 1);
    }

    private final SourceInformationContext contextOf(String information) {
        Map<String, Object> map = this.contexts;
        Object obj = map.get(information);
        if (obj == null) {
            obj = SlotTreeKt.sourceInformationContextOf$default(information, null, 2, null);
            map.put(information, obj);
        }
        if (obj instanceof SourceInformationContext) {
            return (SourceInformationContext) obj;
        }
        return null;
    }

    private final boolean isCall(CompositionGroup group) {
        String sourceInfo = group.getSourceInfo();
        if (sourceInfo != null) {
            return StringsKt.startsWith$default(sourceInfo, "C", false, 2, (Object) null);
        }
        return false;
    }
}

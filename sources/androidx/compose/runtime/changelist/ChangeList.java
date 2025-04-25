package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.data.LogEventArguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: ChangeList.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u000b\u001a\u00020\n2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u001e\u0010\u001c\u001a\u00020\n2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001e2\u0006\u0010\u001f\u001a\u00020 J(\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'J\u0006\u0010)\u001a\u00020\nJ\u0016\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0019J\u001b\u0010,\u001a\u00020\n2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0-¢\u0006\u0002\u0010.J\"\u0010/\u001a\u00020\n2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\n012\u0006\u00103\u001a\u000202J\u0006\u00104\u001a\u00020\nJ\u0006\u00105\u001a\u00020\nJ\u000e\u00106\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u00107\u001a\u00020\nJ\u001a\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 J\u0016\u0010:\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020;J\u001e\u0010:\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020;2\u0006\u0010<\u001a\u00020=J\u000e\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020\u0006J\u001e\u0010@\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0006J\u001e\u0010B\u001a\u00020\n2\u0006\u00103\u001a\u00020C2\u0006\u0010$\u001a\u00020%2\u0006\u0010D\u001a\u00020'J\u000e\u0010E\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020FJ\u0006\u0010G\u001a\u00020\nJ\u0016\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u0006J\u0006\u0010K\u001a\u00020\nJ\u0014\u0010L\u001a\u00020\n2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\n0NJ\u0006\u0010O\u001a\u00020\nJ\u000e\u0010P\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u0006J \u0010Q\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\u0006J\u0010\u0010S\u001a\u00020\n2\b\u0010T\u001a\u0004\u0018\u00010\u001bJ>\u0010U\u001a\u00020\n\"\u0004\b\u0000\u0010V\"\u0004\b\u0001\u0010W2\u0006\u0010\u001a\u001a\u0002HW2\u001d\u0010X\u001a\u0019\u0012\u0004\u0012\u0002HV\u0012\u0004\u0012\u0002HW\u0012\u0004\u0012\u00020\n0Y¢\u0006\u0002\bZ¢\u0006\u0002\u0010[J\u0018\u0010\\\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010R\u001a\u00020\u0006J\u000e\u0010]\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u0006J\u0010\u0010^\u001a\u00020\n2\b\u0010_\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006c"}, d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "()V", "operations", "Landroidx/compose/runtime/changelist/Operations;", LogEventArguments.ARG_SIZE, "", "getSize", "()I", "clear", "", "executeAndFlushAllPendingChanges", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "isEmpty", "", "isNotEmpty", "pushAdvanceSlotsBy", "distance", "pushAppendValue", "anchor", "Landroidx/compose/runtime/Anchor;", "value", "", "pushCopyNodesToNewAnchorLocation", "nodes", "", "effectiveNodeIndex", "Landroidx/compose/runtime/internal/IntRef;", "pushCopySlotTableToAnchorLocation", "resolvedState", "Landroidx/compose/runtime/MovableContentState;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "from", "Landroidx/compose/runtime/MovableContentStateReference;", "to", "pushDeactivateCurrentGroup", "pushDetermineMovableContentNodeIndex", "effectiveNodeIndexOut", "pushDowns", "", "([Ljava/lang/Object;)V", "pushEndCompositionScope", "action", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "composition", "pushEndCurrentGroup", "pushEndMovableContentPlacement", "pushEnsureGroupStarted", "pushEnsureRootStarted", "pushExecuteOperationsIn", "changeList", "pushInsertSlots", "Landroidx/compose/runtime/SlotTable;", "fixups", "Landroidx/compose/runtime/changelist/FixupList;", "pushMoveCurrentGroup", TypedValues.CycleType.S_WAVE_OFFSET, "pushMoveNode", "count", "pushReleaseMovableGroupAtCurrent", "Landroidx/compose/runtime/ControlledComposition;", TypedValues.Custom.S_REFERENCE, "pushRemember", "Landroidx/compose/runtime/RememberObserver;", "pushRemoveCurrentGroup", "pushRemoveNode", "removeFrom", "moveCount", "pushResetSlots", "pushSideEffect", "effect", "Lkotlin/Function0;", "pushSkipToEndOfCurrentGroup", "pushTrimValues", "pushUpdateAnchoredValue", "groupSlotIndex", "pushUpdateAuxData", "data", "pushUpdateNode", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "pushUpdateValue", "pushUps", "pushUseNode", "node", "toDebugString", "", "linePrefix", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class ChangeList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();

    public final int getSize() {
        return this.operations.getOpCodesSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void clear() {
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
        this.operations.executeAndFlushAllPendingOperations(applier, slots, rememberManager);
    }

    public final void pushRemember(RememberObserver value) {
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.Remember remember2 = Operation.Remember.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), value);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, remember.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, remember.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = remember.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(remember.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = remember.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(remember.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + remember + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushUpdateValue(Object value, int groupSlotIndex) {
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.UpdateValue updateValue2 = Operation.UpdateValue.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), value);
        Operation.UpdateValue updateValue3 = Operation.UpdateValue.INSTANCE;
        Operations.WriteScope.m4096setIntA6tL2VI(m4091constructorimpl, Operation.IntParameter.m4048constructorimpl(0), groupSlotIndex);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, updateValue.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, updateValue.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateValue.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(updateValue.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = updateValue.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(updateValue.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + updateValue + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushUpdateAnchoredValue(Object value, Anchor anchor, int groupSlotIndex) {
        Operations operations = this.operations;
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.INSTANCE;
        operations.pushOp(updateAnchoredValue);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.UpdateAnchoredValue updateAnchoredValue2 = Operation.UpdateAnchoredValue.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), value);
        Operation.UpdateAnchoredValue updateAnchoredValue3 = Operation.UpdateAnchoredValue.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(1), anchor);
        Operation.UpdateAnchoredValue updateAnchoredValue4 = Operation.UpdateAnchoredValue.INSTANCE;
        Operations.WriteScope.m4096setIntA6tL2VI(m4091constructorimpl, Operation.IntParameter.m4048constructorimpl(0), groupSlotIndex);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, updateAnchoredValue.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, updateAnchoredValue.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateAnchoredValue.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(updateAnchoredValue.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = updateAnchoredValue.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(updateAnchoredValue.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + updateAnchoredValue + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushAppendValue(Anchor anchor, Object value) {
        Operations operations = this.operations;
        Operation.AppendValue appendValue = Operation.AppendValue.INSTANCE;
        operations.pushOp(appendValue);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.AppendValue appendValue2 = Operation.AppendValue.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), anchor);
        Operation.AppendValue appendValue3 = Operation.AppendValue.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(1), value);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, appendValue.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, appendValue.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = appendValue.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(appendValue.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = appendValue.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(appendValue.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + appendValue + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushTrimValues(int count) {
        Operations operations = this.operations;
        Operation.TrimParentValues trimParentValues = Operation.TrimParentValues.INSTANCE;
        operations.pushOp(trimParentValues);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.TrimParentValues trimParentValues2 = Operation.TrimParentValues.INSTANCE;
        Operations.WriteScope.m4096setIntA6tL2VI(m4091constructorimpl, Operation.IntParameter.m4048constructorimpl(0), count);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, trimParentValues.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, trimParentValues.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = trimParentValues.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(trimParentValues.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = trimParentValues.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(trimParentValues.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + trimParentValues + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushUpdateAuxData(Object data) {
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.UpdateAuxData updateAuxData2 = Operation.UpdateAuxData.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), data);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, updateAuxData.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, updateAuxData.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateAuxData.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(updateAuxData.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = updateAuxData.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(updateAuxData.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + updateAuxData + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushEnsureGroupStarted(Anchor anchor) {
        Operations operations = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.EnsureGroupStarted ensureGroupStarted2 = Operation.EnsureGroupStarted.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), anchor);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, ensureGroupStarted.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, ensureGroupStarted.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = ensureGroupStarted.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(ensureGroupStarted.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = ensureGroupStarted.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(ensureGroupStarted.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + ensureGroupStarted + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable from) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.InsertSlots insertSlots2 = Operation.InsertSlots.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), anchor);
        Operation.InsertSlots insertSlots3 = Operation.InsertSlots.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(1), from);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, insertSlots.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, insertSlots.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = insertSlots.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(insertSlots.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = insertSlots.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(insertSlots.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + insertSlots + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable from, FixupList fixups) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.InsertSlotsWithFixups insertSlotsWithFixups2 = Operation.InsertSlotsWithFixups.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), anchor);
        Operation.InsertSlotsWithFixups insertSlotsWithFixups3 = Operation.InsertSlotsWithFixups.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(1), from);
        Operation.InsertSlotsWithFixups insertSlotsWithFixups4 = Operation.InsertSlotsWithFixups.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(2), fixups);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, insertSlotsWithFixups.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, insertSlotsWithFixups.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = insertSlotsWithFixups.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(insertSlotsWithFixups.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = insertSlotsWithFixups.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(insertSlotsWithFixups.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + insertSlotsWithFixups + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushMoveCurrentGroup(int offset) {
        Operations operations = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.MoveCurrentGroup moveCurrentGroup2 = Operation.MoveCurrentGroup.INSTANCE;
        Operations.WriteScope.m4096setIntA6tL2VI(m4091constructorimpl, Operation.IntParameter.m4048constructorimpl(0), offset);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, moveCurrentGroup.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, moveCurrentGroup.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = moveCurrentGroup.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(moveCurrentGroup.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = moveCurrentGroup.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(moveCurrentGroup.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + moveCurrentGroup + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushEndCompositionScope(Function1<? super Composition, Unit> action, Composition composition) {
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.EndCompositionScope endCompositionScope2 = Operation.EndCompositionScope.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), action);
        Operation.EndCompositionScope endCompositionScope3 = Operation.EndCompositionScope.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(1), composition);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, endCompositionScope.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, endCompositionScope.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = endCompositionScope.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(endCompositionScope.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = endCompositionScope.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(endCompositionScope.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + endCompositionScope + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushUseNode(Object node) {
        if (node instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    public final <T, V> void pushUpdateNode(V value, Function2<? super T, ? super V, Unit> block) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.UpdateNode updateNode2 = Operation.UpdateNode.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), value);
        Operation.UpdateNode updateNode3 = Operation.UpdateNode.INSTANCE;
        int m4059constructorimpl = Operation.ObjectParameter.m4059constructorimpl(1);
        Intrinsics.checkNotNull(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, m4059constructorimpl, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2));
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, updateNode.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, updateNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateNode.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(updateNode.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = updateNode.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(updateNode.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + updateNode + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushRemoveNode(int removeFrom, int moveCount) {
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.RemoveNode removeNode2 = Operation.RemoveNode.INSTANCE;
        Operations.WriteScope.m4096setIntA6tL2VI(m4091constructorimpl, Operation.IntParameter.m4048constructorimpl(0), removeFrom);
        Operation.RemoveNode removeNode3 = Operation.RemoveNode.INSTANCE;
        Operations.WriteScope.m4096setIntA6tL2VI(m4091constructorimpl, Operation.IntParameter.m4048constructorimpl(1), moveCount);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, removeNode.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, removeNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = removeNode.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(removeNode.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = removeNode.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(removeNode.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + removeNode + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushMoveNode(int to, int from, int count) {
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.MoveNode moveNode2 = Operation.MoveNode.INSTANCE;
        Operations.WriteScope.m4096setIntA6tL2VI(m4091constructorimpl, Operation.IntParameter.m4048constructorimpl(1), to);
        Operation.MoveNode moveNode3 = Operation.MoveNode.INSTANCE;
        Operations.WriteScope.m4096setIntA6tL2VI(m4091constructorimpl, Operation.IntParameter.m4048constructorimpl(0), from);
        Operation.MoveNode moveNode4 = Operation.MoveNode.INSTANCE;
        Operations.WriteScope.m4096setIntA6tL2VI(m4091constructorimpl, Operation.IntParameter.m4048constructorimpl(2), count);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, moveNode.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, moveNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = moveNode.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(moveNode.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = moveNode.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(moveNode.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + moveNode + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushAdvanceSlotsBy(int distance) {
        Operations operations = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.AdvanceSlotsBy advanceSlotsBy2 = Operation.AdvanceSlotsBy.INSTANCE;
        Operations.WriteScope.m4096setIntA6tL2VI(m4091constructorimpl, Operation.IntParameter.m4048constructorimpl(0), distance);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, advanceSlotsBy.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, advanceSlotsBy.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = advanceSlotsBy.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(advanceSlotsBy.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = advanceSlotsBy.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(advanceSlotsBy.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + advanceSlotsBy + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushUps(int count) {
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.Ups ups2 = Operation.Ups.INSTANCE;
        Operations.WriteScope.m4096setIntA6tL2VI(m4091constructorimpl, Operation.IntParameter.m4048constructorimpl(0), count);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, ups.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, ups.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = ups.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(ups.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = ups.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(ups.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + ups + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushDowns(Object[] nodes) {
        if (!(nodes.length == 0)) {
            Operations operations = this.operations;
            Operation.Downs downs = Operation.Downs.INSTANCE;
            operations.pushOp(downs);
            Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
            Operation.Downs downs2 = Operation.Downs.INSTANCE;
            Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), nodes);
            if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, downs.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, downs.getObjects())) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int ints = downs.getInts();
            int i = 0;
            for (int i2 = 0; i2 < ints; i2++) {
                if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(downs.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                    i++;
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = downs.getObjects();
            int i3 = 0;
            for (int i4 = 0; i4 < objects; i4++) {
                if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                    if (i > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(downs.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                    i3++;
                }
            }
            String sb4 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
            PreconditionsKt.throwIllegalStateException("Error while pushing " + downs + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
        }
    }

    public final void pushSideEffect(Function0<Unit> effect) {
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.SideEffect sideEffect2 = Operation.SideEffect.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), effect);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, sideEffect.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, sideEffect.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = sideEffect.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(sideEffect.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = sideEffect.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(sideEffect.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + sideEffect + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushDetermineMovableContentNodeIndex(IntRef effectiveNodeIndexOut, Anchor anchor) {
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex2 = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), effectiveNodeIndexOut);
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex3 = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(1), anchor);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, determineMovableContentNodeIndex.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, determineMovableContentNodeIndex.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = determineMovableContentNodeIndex.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(determineMovableContentNodeIndex.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = determineMovableContentNodeIndex.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(determineMovableContentNodeIndex.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + determineMovableContentNodeIndex + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushCopyNodesToNewAnchorLocation(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        if (!nodes.isEmpty()) {
            Operations operations = this.operations;
            Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
            operations.pushOp(copyNodesToNewAnchorLocation);
            Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
            Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation2 = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
            Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(1), nodes);
            Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation3 = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
            Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), effectiveNodeIndex);
            if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, copyNodesToNewAnchorLocation.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, copyNodesToNewAnchorLocation.getObjects())) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int ints = copyNodesToNewAnchorLocation.getInts();
            int i = 0;
            for (int i2 = 0; i2 < ints; i2++) {
                if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(copyNodesToNewAnchorLocation.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                    i++;
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = copyNodesToNewAnchorLocation.getObjects();
            int i3 = 0;
            for (int i4 = 0; i4 < objects; i4++) {
                if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                    if (i > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(copyNodesToNewAnchorLocation.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                    i3++;
                }
            }
            String sb4 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
            PreconditionsKt.throwIllegalStateException("Error while pushing " + copyNodesToNewAnchorLocation + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
        }
    }

    public final void pushCopySlotTableToAnchorLocation(MovableContentState resolvedState, CompositionContext parentContext, MovableContentStateReference from, MovableContentStateReference to) {
        Operations operations = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation2 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), resolvedState);
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation3 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(1), parentContext);
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation4 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(3), to);
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation5 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(2), from);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, copySlotTableToAnchorLocation.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, copySlotTableToAnchorLocation.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = copySlotTableToAnchorLocation.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(copySlotTableToAnchorLocation.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = copySlotTableToAnchorLocation.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(copySlotTableToAnchorLocation.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + copySlotTableToAnchorLocation + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushReleaseMovableGroupAtCurrent(ControlledComposition composition, CompositionContext parentContext, MovableContentStateReference reference) {
        Operations operations = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent2 = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), composition);
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent3 = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(1), parentContext);
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent4 = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(2), reference);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, releaseMovableGroupAtCurrent.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, releaseMovableGroupAtCurrent.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = releaseMovableGroupAtCurrent.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(releaseMovableGroupAtCurrent.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = releaseMovableGroupAtCurrent.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(releaseMovableGroupAtCurrent.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + releaseMovableGroupAtCurrent + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public static /* synthetic */ void pushExecuteOperationsIn$default(ChangeList changeList, ChangeList changeList2, IntRef intRef, int i, Object obj) {
        if ((i & 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    public final void pushExecuteOperationsIn(ChangeList changeList, IntRef effectiveNodeIndex) {
        if (changeList.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations m4091constructorimpl = Operations.WriteScope.m4091constructorimpl(operations);
            Operation.ApplyChangeList applyChangeList2 = Operation.ApplyChangeList.INSTANCE;
            Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(0), changeList);
            Operation.ApplyChangeList applyChangeList3 = Operation.ApplyChangeList.INSTANCE;
            Operations.WriteScope.m4097setObjectDKhxnng(m4091constructorimpl, Operation.ObjectParameter.m4059constructorimpl(1), effectiveNodeIndex);
            if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, applyChangeList.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, applyChangeList.getObjects())) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int ints = applyChangeList.getInts();
            int i = 0;
            for (int i2 = 0; i2 < ints; i2++) {
                if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(applyChangeList.mo4020intParamNamew8GmfQM(Operation.IntParameter.m4048constructorimpl(i2)));
                    i++;
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = applyChangeList.getObjects();
            int i3 = 0;
            for (int i4 = 0; i4 < objects; i4++) {
                if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                    if (i > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(applyChangeList.mo4021objectParamName31yXWZQ(Operation.ObjectParameter.m4059constructorimpl(i4)));
                    i3++;
                }
            }
            String sb4 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
            PreconditionsKt.throwIllegalStateException("Error while pushing " + applyChangeList + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").");
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String linePrefix) {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeList instance containing ");
        sb.append(getSize());
        sb.append(" operations");
        if (sb.length() > 0) {
            sb.append(":\n");
            sb.append(this.operations.toDebugString(linePrefix));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}

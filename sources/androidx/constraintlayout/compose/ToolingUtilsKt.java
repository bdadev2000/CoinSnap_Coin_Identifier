package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.xx.constants.LogEvents;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ToolingUtils.kt */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002\u001a\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0002\u001a0\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u001aH\u0000\u001a$\u0010'\u001a\n (*\u0004\u0018\u00010 0 *\u00020)2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0001H\u0002\u001a\u0014\u0010*\u001a\u00020\u001a*\u00020)2\u0006\u0010\"\u001a\u00020#H\u0002\u001a\u000e\u0010+\u001a\u00020\u001a*\u0004\u0018\u00010)H\u0002\u001aV\u0010,\u001a\u00020\u0015*\u00020 2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a022\u0006\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002002\b\b\u0002\u00106\u001a\u000200H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"5\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00068@@@X\u0081\u008e\u0002¢\u0006\u0018\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013*\u0004\b\u000e\u0010\u000f¨\u00067"}, d2 = {"BOUNDS", "", "CONSTRAINTS", "CONSTRAINTS_JSON_VERSION", "DesignInfoDataKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "getDesignInfoDataKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "<set-?>", "designInfoProvider", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getDesignInfoProvider$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getDesignInfoProvider$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "getDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", "setDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/constraintlayout/compose/DesignInfoProvider;)V", "addReferencesIds", "", "helperWidget", "Landroidx/constraintlayout/core/widgets/HelperWidget;", "helperReferences", "", "", "root", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "rootId", "createDesignInfoJson", "content", "Lorg/json/JSONObject;", "parseConstraintsToJson", "state", "Landroidx/constraintlayout/compose/State;", "startX", "startY", "args", "boundsToJson", "kotlin.jvm.PlatformType", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "getHelperId", "getRefId", "putViewIdToBoundsAndConstraints", "viewId", "boxJson", "isHelper", "", "isRoot", "", "constraintsInfoArray", "Lorg/json/JSONArray;", "withConstraints", "withBounds", "constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class ToolingUtilsKt {
    private static final int BOUNDS = 1;
    private static final int CONSTRAINTS = 0;
    private static final int CONSTRAINTS_JSON_VERSION = 1;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ToolingUtilsKt.class, "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", 1))};
    private static final SemanticsPropertyKey<DesignInfoProvider> DesignInfoDataKey = new SemanticsPropertyKey<>("DesignInfoProvider", null, 2, null);

    public static /* synthetic */ void getDesignInfoProvider$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public static final SemanticsPropertyKey<DesignInfoProvider> getDesignInfoDataKey() {
        return DesignInfoDataKey;
    }

    public static final DesignInfoProvider getDesignInfoProvider(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return DesignInfoDataKey.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    public static final void setDesignInfoProvider(SemanticsPropertyReceiver semanticsPropertyReceiver, DesignInfoProvider designInfoProvider) {
        DesignInfoDataKey.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], designInfoProvider);
    }

    public static final String parseConstraintsToJson(ConstraintWidgetContainer constraintWidgetContainer, State state, int i, int i2, String str) {
        boolean z;
        boolean z2;
        ArrayList<ConstraintWidget> arrayList;
        ArrayList<ConstraintAnchor> arrayList2;
        int i3;
        int i4;
        String refId;
        String valueOf = String.valueOf(androidx.constraintlayout.core.state.State.PARENT);
        JSONObject jSONObject = new JSONObject();
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            int intValue = intOrNull.intValue();
            boolean z3 = (intValue >> 1) == 1;
            z = intValue == 1;
            z2 = z3;
        } else {
            z = true;
            z2 = true;
        }
        ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        int i5 = 0;
        while (i5 < size) {
            ConstraintWidget constraintWidget = children.get(i5);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList3 = new ArrayList();
            boolean z4 = constraintWidget instanceof HelperWidget;
            String str2 = constraintWidget.stringId;
            if (z4) {
                Intrinsics.checkNotNull(constraintWidget, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.HelperWidget");
                addReferencesIds((HelperWidget) constraintWidget, arrayList3, constraintWidgetContainer, valueOf);
            }
            ArrayList<ConstraintAnchor> anchors = constraintWidget.getAnchors();
            int size2 = anchors.size();
            int i6 = 0;
            while (i6 < size2) {
                ConstraintAnchor constraintAnchor = anchors.get(i6);
                if (constraintAnchor.isConnected()) {
                    arrayList = children;
                    ConstraintWidget owner = constraintAnchor.getTarget().getOwner();
                    arrayList2 = anchors;
                    boolean z5 = owner instanceof HelperWidget;
                    if (Intrinsics.areEqual(constraintWidgetContainer, owner)) {
                        refId = valueOf;
                    } else if (z5) {
                        refId = getHelperId(owner, state);
                    } else {
                        refId = getRefId(owner);
                    }
                    i3 = size2;
                    i4 = i5;
                    JSONObject put = new JSONObject().put("originAnchor", constraintAnchor.getType());
                    ConstraintAnchor target = constraintAnchor.getTarget();
                    Intrinsics.checkNotNull(target);
                    jSONArray.put(put.put("targetAnchor", target.getType()).put("target", refId).put("margin", constraintAnchor.getMargin()));
                } else {
                    arrayList = children;
                    arrayList2 = anchors;
                    i3 = size2;
                    i4 = i5;
                }
                i6++;
                size2 = i3;
                children = arrayList;
                anchors = arrayList2;
                i5 = i4;
            }
            putViewIdToBoundsAndConstraints(jSONObject, str2, boundsToJson(constraintWidget, i, i2), z4, false, arrayList3, jSONArray, z, z2);
            i5++;
            size = size;
            children = children;
        }
        putViewIdToBoundsAndConstraints(jSONObject, valueOf, boundsToJson(constraintWidgetContainer, i, i2), false, true, CollectionsKt.emptyList(), new JSONArray(), z, z2);
        return createDesignInfoJson(jSONObject);
    }

    private static final void addReferencesIds(HelperWidget helperWidget, List<String> list, ConstraintWidgetContainer constraintWidgetContainer, String str) {
        int i = helperWidget.mWidgetsCount;
        for (int i2 = 0; i2 < i; i2++) {
            ConstraintWidget constraintWidget = helperWidget.mWidgets[i2];
            list.add(Intrinsics.areEqual(constraintWidget, constraintWidgetContainer) ? str : getRefId(constraintWidget));
        }
    }

    private static final String getHelperId(ConstraintWidget constraintWidget, State state) {
        Intrinsics.checkNotNull(constraintWidget, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.HelperWidget");
        return String.valueOf(state.getKeyId$constraintlayout_compose_release((HelperWidget) constraintWidget));
    }

    private static final String getRefId(ConstraintWidget constraintWidget) {
        Object layoutId;
        String obj;
        Object companionWidget = constraintWidget != null ? constraintWidget.getCompanionWidget() : null;
        Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
        if (measurable == null || (layoutId = LayoutIdKt.getLayoutId(measurable)) == null || (obj = layoutId.toString()) == null) {
            return String.valueOf(constraintWidget != null ? constraintWidget.stringId : null);
        }
        return obj;
    }

    private static final String createDesignInfoJson(JSONObject jSONObject) {
        return new JSONObject().put("type", "CONSTRAINTS").put(LogEventArguments.ARG_VERSION, 1).put("content", jSONObject).toString();
    }

    private static final JSONObject boundsToJson(ConstraintWidget constraintWidget, int i, int i2) {
        return new JSONObject().put(TtmlNode.LEFT, constraintWidget.getLeft() + i).put("top", constraintWidget.getTop() + i2).put(TtmlNode.RIGHT, constraintWidget.getRight() + i).put(LogEvents.bottom, constraintWidget.getBottom() + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void putViewIdToBoundsAndConstraints(JSONObject jSONObject, String str, JSONObject jSONObject2, boolean z, boolean z2, List<String> list, JSONArray jSONArray, boolean z3, boolean z4) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("viewId", str);
        if (z4) {
            jSONObject3.put("box", jSONObject2);
        }
        jSONObject3.put("isHelper", z);
        jSONObject3.put("isRoot", z2);
        JSONArray jSONArray2 = new JSONArray();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jSONArray2.put(list.get(i));
        }
        jSONObject3.put("helperReferences", jSONArray2);
        if (z3) {
            jSONObject3.put("constraints", jSONArray);
        }
        jSONObject.put(str, jSONObject3);
    }
}

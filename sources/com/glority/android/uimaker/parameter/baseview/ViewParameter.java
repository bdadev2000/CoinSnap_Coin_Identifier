package com.glority.android.uimaker.parameter.baseview;

import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.attribute.ImageFile;
import com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewParameter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u0086\u00012\u00020\u0001:\u0004\u0085\u0001\u0086\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010}\u001a\u00020~J\u0006\u0010\u007f\u001a\u00020\"J\u001f\u0010\u0080\u0001\u001a\u00020\"2\u000b\b\u0002\u0010\u0081\u0001\u001a\u0004\u0018\u00010a2\t\b\u0002\u0010\u0082\u0001\u001a\u00020\"J\u001f\u0010\u0083\u0001\u001a\u00020\"2\u000b\b\u0002\u0010\u0081\u0001\u001a\u0004\u0018\u00010a2\t\b\u0002\u0010\u0084\u0001\u001a\u00020\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001c\u0010*\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R\u001c\u0010-\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001a\u00100\u001a\u000201X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\"X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R\u001a\u00109\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0012\"\u0004\b;\u0010\u0014R\u001a\u0010<\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&R\u001a\u0010?\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010$\"\u0004\bA\u0010&R\u001a\u0010B\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R\u001a\u0010E\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010$\"\u0004\bG\u0010&R\u001a\u0010H\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010$\"\u0004\bJ\u0010&R\u001a\u0010K\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010$\"\u0004\bM\u0010&R\u001a\u0010N\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010$\"\u0004\bP\u0010&R\u001a\u0010Q\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010$\"\u0004\bS\u0010&R\u001a\u0010T\u001a\u00020UX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010Z\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010$\"\u0004\b\\\u0010&R\u001a\u0010]\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010$\"\u0004\b_\u0010&R\u001c\u0010`\u001a\u0004\u0018\u00010aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001c\u0010f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0012\"\u0004\bh\u0010\u0014R\u001c\u0010i\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0012\"\u0004\bk\u0010\u0014R\u001c\u0010l\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0012\"\u0004\bn\u0010\u0014R\u001c\u0010o\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0012\"\u0004\bq\u0010\u0014R\u0014\u0010r\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010\u0012R\u001a\u0010t\u001a\u00020\"X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010$\"\u0004\bv\u0010&R\u001a\u0010w\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010$\"\u0004\by\u0010&R\u001a\u0010z\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010$\"\u0004\b|\u0010&¨\u0006\u0087\u0001"}, d2 = {"Lcom/glority/android/uimaker/parameter/baseview/ViewParameter;", "Lcom/glority/android/uimaker/parameter/baseview/BaseUiMakerParameter;", "()V", "backgroundColorParameter", "Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "getBackgroundColorParameter", "()Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "setBackgroundColorParameter", "(Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;)V", "backgroundImage", "Lcom/glority/android/uimaker/parameter/attribute/ImageFile;", "getBackgroundImage", "()Lcom/glority/android/uimaker/parameter/attribute/ImageFile;", "setBackgroundImage", "(Lcom/glority/android/uimaker/parameter/attribute/ImageFile;)V", "bottomToBottom", "", "getBottomToBottom", "()Ljava/lang/String;", "setBottomToBottom", "(Ljava/lang/String;)V", "bottomToTop", "getBottomToTop", "setBottomToTop", "centerXToCenterX", "getCenterXToCenterX", "setCenterXToCenterX", "centerYToCenterY", "getCenterYToCenterY", "setCenterYToCenterY", "click", "getClick", "setClick", "cornerRadius", "", "getCornerRadius", "()I", "setCornerRadius", "(I)V", "endToEnd", "getEndToEnd", "setEndToEnd", "endToStart", "getEndToStart", "setEndToStart", "figmaName", "getFigmaName", "setFigmaName", "floating", "", "getFloating", "()Z", "setFloating", "(Z)V", "height", "getHeight", "setHeight", "id", "getId", "setId", "marginBottom", "getMarginBottom", "setMarginBottom", "marginEnd", "getMarginEnd", "setMarginEnd", "marginStart", "getMarginStart", "setMarginStart", "marginTop", "getMarginTop", "setMarginTop", "maxHeight", "getMaxHeight", "setMaxHeight", "maxWidth", "getMaxWidth", "setMaxWidth", "minHeight", "getMinHeight", "setMinHeight", "minWidth", "getMinWidth", "setMinWidth", "opacity", "", "getOpacity", "()F", "setOpacity", "(F)V", "originalHeight", "getOriginalHeight", "setOriginalHeight", "originalWidth", "getOriginalWidth", "setOriginalWidth", "parentViewParameter", "Lcom/glority/android/uimaker/parameter/baseview/ViewGroupParameter;", "getParentViewParameter", "()Lcom/glority/android/uimaker/parameter/baseview/ViewGroupParameter;", "setParentViewParameter", "(Lcom/glority/android/uimaker/parameter/baseview/ViewGroupParameter;)V", "startToEnd", "getStartToEnd", "setStartToEnd", "startToStart", "getStartToStart", "setStartToStart", "topToBottom", "getTopToBottom", "setTopToBottom", "topToTop", "getTopToTop", "setTopToTop", "viewName", "getViewName", "width", "getWidth", "setWidth", "x", "getX", "setX", "y", "getY", "setY", "clearVerticalConstraint", "", "getEndPoint", "getXInWindow", "parameter", "x1", "getYInWindow", "y1", "CONSTRAINT", "Layout", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public class ViewParameter implements BaseUiMakerParameter {
    private ColorParameter backgroundColorParameter;
    private ImageFile backgroundImage;
    private String bottomToBottom;
    private String bottomToTop;
    private String centerXToCenterX;
    private String centerYToCenterY;
    private String click;
    private int cornerRadius;
    private String endToEnd;
    private String endToStart;
    private String figmaName;
    private boolean floating;
    private int height;
    private String id;
    private int marginBottom;
    private int marginEnd;
    private int marginStart;
    private int marginTop;
    private int maxHeight;
    private int maxWidth;
    private int minHeight;
    private int minWidth;
    private float opacity;
    private int originalHeight;
    private int originalWidth;
    private ViewGroupParameter parentViewParameter;
    private String startToEnd;
    private String startToStart;
    private String topToBottom;
    private String topToTop;
    private int width;
    private int x;
    private int y;

    /* renamed from: Layout, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int wrapContent = -2;
    private static final int matchParent = -1;

    /* compiled from: ViewParameter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/glority/android/uimaker/parameter/baseview/ViewParameter$CONSTRAINT;", "", "(Ljava/lang/String;I)V", "window", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public enum CONSTRAINT {
        window
    }

    public ViewParameter() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "UUID.randomUUID().toString()");
        this.id = uuid;
        this.opacity = 1.0f;
    }

    @Override // com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter
    public List<String> multiStateName() {
        return BaseUiMakerParameter.DefaultImpls.multiStateName(this);
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final String getFigmaName() {
        return this.figmaName;
    }

    public final void setFigmaName(String str) {
        this.figmaName = str;
    }

    public final ViewGroupParameter getParentViewParameter() {
        return this.parentViewParameter;
    }

    public final void setParentViewParameter(ViewGroupParameter viewGroupParameter) {
        this.parentViewParameter = viewGroupParameter;
    }

    public final ImageFile getBackgroundImage() {
        return this.backgroundImage;
    }

    public final void setBackgroundImage(ImageFile imageFile) {
        this.backgroundImage = imageFile;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public final int getX() {
        return this.x;
    }

    public final void setX(int i) {
        this.x = i;
    }

    public final int getY() {
        return this.y;
    }

    public final void setY(int i) {
        this.y = i;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public final int getOriginalHeight() {
        return this.originalHeight;
    }

    public final void setOriginalHeight(int i) {
        this.originalHeight = i;
    }

    public final int getMinHeight() {
        return this.minHeight;
    }

    public final void setMinHeight(int i) {
        this.minHeight = i;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final void setMinWidth(int i) {
        this.minWidth = i;
    }

    public final int getOriginalWidth() {
        return this.originalWidth;
    }

    public final void setOriginalWidth(int i) {
        this.originalWidth = i;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final void setCornerRadius(int i) {
        this.cornerRadius = i;
    }

    public final ColorParameter getBackgroundColorParameter() {
        return this.backgroundColorParameter;
    }

    public final void setBackgroundColorParameter(ColorParameter colorParameter) {
        this.backgroundColorParameter = colorParameter;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final void setOpacity(float f) {
        this.opacity = f;
    }

    public final int getMarginStart() {
        return this.marginStart;
    }

    public final void setMarginStart(int i) {
        this.marginStart = i;
    }

    public final int getMarginEnd() {
        return this.marginEnd;
    }

    public final void setMarginEnd(int i) {
        this.marginEnd = i;
    }

    public final int getMarginTop() {
        return this.marginTop;
    }

    public final void setMarginTop(int i) {
        this.marginTop = i;
    }

    public final int getMarginBottom() {
        return this.marginBottom;
    }

    public final void setMarginBottom(int i) {
        this.marginBottom = i;
    }

    public final String getStartToStart() {
        return this.startToStart;
    }

    public final void setStartToStart(String str) {
        this.startToStart = str;
    }

    public final String getStartToEnd() {
        return this.startToEnd;
    }

    public final void setStartToEnd(String str) {
        this.startToEnd = str;
    }

    public final String getEndToEnd() {
        return this.endToEnd;
    }

    public final void setEndToEnd(String str) {
        this.endToEnd = str;
    }

    public final String getEndToStart() {
        return this.endToStart;
    }

    public final void setEndToStart(String str) {
        this.endToStart = str;
    }

    public final String getTopToTop() {
        return this.topToTop;
    }

    public final void setTopToTop(String str) {
        this.topToTop = str;
    }

    public final String getTopToBottom() {
        return this.topToBottom;
    }

    public final void setTopToBottom(String str) {
        this.topToBottom = str;
    }

    public final String getBottomToTop() {
        return this.bottomToTop;
    }

    public final void setBottomToTop(String str) {
        this.bottomToTop = str;
    }

    public final String getBottomToBottom() {
        return this.bottomToBottom;
    }

    public final void setBottomToBottom(String str) {
        this.bottomToBottom = str;
    }

    public final boolean getFloating() {
        return this.floating;
    }

    public final void setFloating(boolean z) {
        this.floating = z;
    }

    public final String getCenterYToCenterY() {
        return this.centerYToCenterY;
    }

    public final void setCenterYToCenterY(String str) {
        this.centerYToCenterY = str;
    }

    public final String getCenterXToCenterX() {
        return this.centerXToCenterX;
    }

    public final void setCenterXToCenterX(String str) {
        this.centerXToCenterX = str;
    }

    public final String getClick() {
        return this.click;
    }

    public final void setClick(String str) {
        this.click = str;
    }

    /* compiled from: ViewParameter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/glority/android/uimaker/parameter/baseview/ViewParameter$Layout;", "", "()V", "matchParent", "", "getMatchParent", "()I", "wrapContent", "getWrapContent", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.glority.android.uimaker.parameter.baseview.ViewParameter$Layout, reason: from kotlin metadata */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getWrapContent() {
            return ViewParameter.wrapContent;
        }

        public final int getMatchParent() {
            return ViewParameter.matchParent;
        }
    }

    @Override // com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter
    public String getViewName() {
        return "VIEW";
    }

    public final int getEndPoint() {
        return this.x + this.originalWidth;
    }

    public static /* synthetic */ int getXInWindow$default(ViewParameter viewParameter, ViewGroupParameter viewGroupParameter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getXInWindow");
        }
        if ((i2 & 1) != 0) {
            viewGroupParameter = viewParameter.parentViewParameter;
        }
        if ((i2 & 2) != 0) {
            i = viewParameter.x;
        }
        return viewParameter.getXInWindow(viewGroupParameter, i);
    }

    public final int getXInWindow(ViewGroupParameter parameter, int x1) {
        if (parameter == null) {
            return x1;
        }
        return getXInWindow(parameter.getParentViewParameter(), parameter.getX() + x1);
    }

    public static /* synthetic */ int getYInWindow$default(ViewParameter viewParameter, ViewGroupParameter viewGroupParameter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getYInWindow");
        }
        if ((i2 & 1) != 0) {
            viewGroupParameter = viewParameter.parentViewParameter;
        }
        if ((i2 & 2) != 0) {
            i = viewParameter.y;
        }
        return viewParameter.getYInWindow(viewGroupParameter, i);
    }

    public final int getYInWindow(ViewGroupParameter parameter, int y1) {
        if (parameter == null) {
            return y1;
        }
        return getYInWindow(parameter.getParentViewParameter(), parameter.getY() + y1);
    }

    public final void clearVerticalConstraint() {
        this.topToTop = null;
        this.topToBottom = null;
        this.bottomToBottom = null;
        this.bottomToTop = null;
        this.marginTop = 0;
        this.marginBottom = 0;
    }
}

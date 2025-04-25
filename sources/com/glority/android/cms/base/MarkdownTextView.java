package com.glority.android.cms.base;

import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.NotificationCompat;
import com.glority.android.cms.base.MarkdownTextView;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarkdownTextView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/glority/android/cms/base/MarkdownTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dontConsumeNonUrlClicks", "", "getDontConsumeNonUrlClicks", "()Z", "setDontConsumeNonUrlClicks", "(Z)V", "linkHit", "getLinkHit", "setLinkHit", "onTouchEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "LocalLinkMovementMethod", "base-cms_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class MarkdownTextView extends AppCompatTextView {
    private HashMap _$_findViewCache;
    private boolean dontConsumeNonUrlClicks;
    private boolean linkHit;

    public MarkdownTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MarkdownTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ MarkdownTextView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            r2 = 0
            r5 = r2
            android.util.AttributeSet r5 = (android.util.AttributeSet) r5
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cms.base.MarkdownTextView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dontConsumeNonUrlClicks = true;
    }

    public final boolean getDontConsumeNonUrlClicks() {
        return this.dontConsumeNonUrlClicks;
    }

    public final void setDontConsumeNonUrlClicks(boolean z) {
        this.dontConsumeNonUrlClicks = z;
    }

    public final boolean getLinkHit() {
        return this.linkHit;
    }

    public final void setLinkHit(boolean z) {
        this.linkHit = z;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.linkHit = false;
        return this.dontConsumeNonUrlClicks ? this.linkHit : super.onTouchEvent(event);
    }

    /* compiled from: MarkdownTextView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/glority/android/cms/base/MarkdownTextView$LocalLinkMovementMethod;", "Landroid/text/method/LinkMovementMethod;", "()V", "onTouchEvent", "", "widget", "Landroid/widget/TextView;", "buffer", "Landroid/text/Spannable;", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "Companion", "base-cms_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class LocalLinkMovementMethod extends LinkMovementMethod {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<LocalLinkMovementMethod>() { // from class: com.glority.android.cms.base.MarkdownTextView$LocalLinkMovementMethod$Companion$instance$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MarkdownTextView.LocalLinkMovementMethod invoke() {
                return new MarkdownTextView.LocalLinkMovementMethod(null);
            }
        });

        private LocalLinkMovementMethod() {
        }

        public /* synthetic */ LocalLinkMovementMethod(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
        public boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            Intrinsics.checkNotNullParameter(event, "event");
            int action = event.getAction();
            if (action == 1 || action == 0) {
                int x = (int) event.getX();
                int y = (int) event.getY();
                int totalPaddingLeft = x - widget.getTotalPaddingLeft();
                int totalPaddingTop = y - widget.getTotalPaddingTop();
                int scrollX = totalPaddingLeft + widget.getScrollX();
                int scrollY = totalPaddingTop + widget.getScrollY();
                Layout layout = widget.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                ClickableSpan[] link = (ClickableSpan[]) buffer.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                Intrinsics.checkNotNullExpressionValue(link, "link");
                if (!(link.length == 0)) {
                    if (action == 1) {
                        link[0].onClick(widget);
                    } else if (action == 0) {
                        Selection.setSelection(buffer, buffer.getSpanStart(link[0]), buffer.getSpanEnd(link[0]));
                    }
                    if (!(widget instanceof MarkdownTextView)) {
                        return true;
                    }
                    ((MarkdownTextView) widget).setLinkHit(true);
                    return true;
                }
                Selection.removeSelection(buffer);
                Touch.onTouchEvent(widget, buffer, event);
                return false;
            }
            return Touch.onTouchEvent(widget, buffer, event);
        }

        /* compiled from: MarkdownTextView.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/glority/android/cms/base/MarkdownTextView$LocalLinkMovementMethod$Companion;", "", "()V", "instance", "Lcom/glority/android/cms/base/MarkdownTextView$LocalLinkMovementMethod;", "getInstance", "()Lcom/glority/android/cms/base/MarkdownTextView$LocalLinkMovementMethod;", "instance$delegate", "Lkotlin/Lazy;", "base-cms_release"}, k = 1, mv = {1, 4, 2})
        /* loaded from: classes14.dex */
        public static final class Companion {
            public final LocalLinkMovementMethod getInstance() {
                Lazy lazy = LocalLinkMovementMethod.instance$delegate;
                Companion companion = LocalLinkMovementMethod.INSTANCE;
                return (LocalLinkMovementMethod) lazy.getValue();
            }

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}

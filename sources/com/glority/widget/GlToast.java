package com.glority.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlToast.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u0007\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0007\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0010J%\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0013J \u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u0007\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0010J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0010J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0010J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\u001a"}, d2 = {"Lcom/glority/widget/GlToast;", "", "()V", "getToast", "Landroid/widget/Toast;", "context", "Landroid/content/Context;", "make", "Lcom/glority/widget/GlToast$BaseGlToastBuilder;", "drawable", "Landroid/graphics/drawable/Drawable;", NotificationCompat.CATEGORY_MESSAGE, "", "Lcom/glority/widget/GlToast$GlToastBuilder;", "view", "Landroid/view/View;", "", "drawableResId", "msgResId", "(Landroid/content/Context;ILjava/lang/Integer;)Lcom/glority/widget/GlToast$BaseGlToastBuilder;", "makeError", "makeNotice", "makeSuccessful", "BaseGlToastBuilder", "Duration", "GlToastBuilder", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlToast {
    public static final GlToast INSTANCE = new GlToast();

    /* compiled from: GlToast.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/glority/widget/GlToast$Duration;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "SHORT", "LONG", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public enum Duration {
        SHORT(0),
        LONG(1);

        private final int value;

        Duration(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    private GlToast() {
    }

    /* compiled from: GlToast.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/glority/widget/GlToast$GlToastBuilder;", "Lcom/glority/widget/GlToast$BaseGlToastBuilder;", "toast", "Landroid/widget/Toast;", "context", "Landroid/content/Context;", "(Landroid/widget/Toast;Landroid/content/Context;)V", "show", "", TypedValues.TransitionType.S_DURATION, "Lcom/glority/widget/GlToast$Duration;", "showCenter", "showTop", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class GlToastBuilder extends BaseGlToastBuilder {
        private final Context context;
        private final Toast toast;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GlToastBuilder(Toast toast, Context context) {
            super(toast, context);
            Intrinsics.checkNotNullParameter(toast, "toast");
            Intrinsics.checkNotNullParameter(context, "context");
            this.toast = toast;
            this.context = context;
        }

        public static /* synthetic */ void showTop$default(GlToastBuilder glToastBuilder, Duration duration, int i, Object obj) {
            if ((i & 1) != 0) {
                duration = Duration.SHORT;
            }
            glToastBuilder.showTop(duration);
        }

        public final void showTop(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.toast.setDuration(duration.getValue());
            this.toast.setGravity(48, 0, this.context.getResources().getDimensionPixelOffset(R.dimen.x60));
            try {
                this.toast.show();
            } catch (Throwable unused) {
            }
        }

        public static /* synthetic */ void showCenter$default(GlToastBuilder glToastBuilder, Duration duration, int i, Object obj) {
            if ((i & 1) != 0) {
                duration = Duration.SHORT;
            }
            glToastBuilder.showCenter(duration);
        }

        public final void showCenter(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.toast.setDuration(duration.getValue());
            this.toast.setGravity(17, 0, 0);
            try {
                this.toast.show();
            } catch (Throwable unused) {
            }
        }

        @Override // com.glority.widget.GlToast.BaseGlToastBuilder
        public void show(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.toast.setDuration(duration.getValue());
            try {
                this.toast.show();
            } catch (Throwable unused) {
            }
        }

        public final void show() {
            this.toast.setDuration(Duration.SHORT.getValue());
            try {
                this.toast.show();
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: GlToast.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/glority/widget/GlToast$BaseGlToastBuilder;", "", "toast", "Landroid/widget/Toast;", "context", "Landroid/content/Context;", "(Landroid/widget/Toast;Landroid/content/Context;)V", "cancel", "", "show", TypedValues.TransitionType.S_DURATION, "Lcom/glority/widget/GlToast$Duration;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static class BaseGlToastBuilder {
        private final Context context;
        private final Toast toast;

        public BaseGlToastBuilder(Toast toast, Context context) {
            Intrinsics.checkNotNullParameter(toast, "toast");
            Intrinsics.checkNotNullParameter(context, "context");
            this.toast = toast;
            this.context = context;
        }

        public static /* synthetic */ void show$default(BaseGlToastBuilder baseGlToastBuilder, Duration duration, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
            }
            if ((i & 1) != 0) {
                duration = Duration.SHORT;
            }
            baseGlToastBuilder.show(duration);
        }

        public void show(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.toast.setGravity(17, 0, 0);
            try {
                this.toast.setDuration(duration.getValue());
                this.toast.show();
            } catch (Throwable unused) {
            }
        }

        public final void cancel() {
            try {
                this.toast.cancel();
            } catch (Throwable unused) {
            }
        }
    }

    public final GlToastBuilder make(Context context, int msg) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(msg);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(msg)");
        return make(context, string);
    }

    public final GlToastBuilder make(Context context, String msg) {
        TextView textView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Toast toast = getToast(context);
        toast.setView(LayoutInflater.from(context).inflate(R.layout.gl_item_toast_msg, (ViewGroup) null));
        View view = toast.getView();
        if (view != null && (textView = (TextView) view.findViewById(R.id.gl_tv)) != null) {
            textView.setText(msg);
        }
        return new GlToastBuilder(toast, context);
    }

    public final BaseGlToastBuilder makeNotice(Context context, int msg) {
        Intrinsics.checkNotNullParameter(context, "context");
        return makeNotice(context, context.getString(msg));
    }

    public final BaseGlToastBuilder makeNotice(Context context, String msg) {
        Intrinsics.checkNotNullParameter(context, "context");
        return make(context, context.getDrawable(R.drawable.gl_icon_notice), msg);
    }

    public final BaseGlToastBuilder makeError(Context context, int msg) {
        Intrinsics.checkNotNullParameter(context, "context");
        return makeNotice(context, context.getString(msg));
    }

    public final BaseGlToastBuilder makeError(Context context, String msg) {
        Intrinsics.checkNotNullParameter(context, "context");
        return make(context, context.getDrawable(R.drawable.gl_icon_failed), msg);
    }

    public final BaseGlToastBuilder makeSuccessful(Context context, int msg) {
        Intrinsics.checkNotNullParameter(context, "context");
        return makeNotice(context, context.getString(msg));
    }

    public final BaseGlToastBuilder makeSuccessful(Context context, String msg) {
        Intrinsics.checkNotNullParameter(context, "context");
        return make(context, context.getDrawable(R.drawable.gl_icon_successful), msg);
    }

    public final BaseGlToastBuilder make(Context context, Drawable drawable, String msg) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(context, "context");
        Toast toast = getToast(context);
        toast.setView(LayoutInflater.from(context).inflate(R.layout.gl_item_toast_success, (ViewGroup) null));
        View view = toast.getView();
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.icon)) != null) {
            imageView.setImageDrawable(drawable);
        }
        String str = msg;
        if (str == null || str.length() == 0) {
            View view2 = toast.getView();
            if (view2 != null && (textView = (TextView) view2.findViewById(R.id.gl_tv)) != null) {
                textView.setHeight(0);
            }
        } else {
            View view3 = toast.getView();
            if (view3 != null && (textView2 = (TextView) view3.findViewById(R.id.gl_tv)) != null) {
                textView2.setText(str);
            }
        }
        return new BaseGlToastBuilder(toast, context);
    }

    public final BaseGlToastBuilder make(Context context, int drawableResId, Integer msgResId) {
        Intrinsics.checkNotNullParameter(context, "context");
        return make(context, context.getDrawable(drawableResId), msgResId == null ? null : context.getString(msgResId.intValue()));
    }

    public final BaseGlToastBuilder make(Context context, int drawableResId, String msg) {
        Intrinsics.checkNotNullParameter(context, "context");
        return make(context, context.getDrawable(drawableResId), msg);
    }

    public final GlToastBuilder make(Context context, View view) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Toast toast = getToast(context);
        toast.setView(view);
        return new GlToastBuilder(toast, context);
    }

    private final Toast getToast(Context context) {
        Toast toast = new Toast(context);
        toast.setDuration(0);
        return toast;
    }
}

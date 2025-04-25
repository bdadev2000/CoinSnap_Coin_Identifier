package com.glority.android.core.ext;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.fragment.FragmentKt;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewExtensions.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0006\u001aB\u0010\u0007\u001a\u00020\u0001*\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u001a8\u0010\u0007\u001a\u00020\u0001*\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u001a\n\u0010\u0013\u001a\u00020\u0004*\u00020\u0006\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u001a(\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u001a\u001a\u001e\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001b\u001aM\u0010\u001c\u001a\u00020\u0001*\u00020\b2\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001e2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0002\u0010#\u001aU\u0010\u001c\u001a\u00020\u0001\"\b\b\u0000\u0010$*\u00020\b*\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H$0\u001e2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0002\u0010%¨\u0006&"}, d2 = {"alphaEnable", "", "Landroid/view/View;", "enable", "", "finish", "Landroidx/fragment/app/Fragment;", "navigate", "Landroid/app/Activity;", "navHostId", "", "actionId", "args", "Landroid/os/Bundle;", "options", "Landroidx/navigation/NavOptions;", "extras", "Landroidx/navigation/Navigator$Extras;", "resId", "navigateUp", "setRipple", TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "setSingleClickListener", "elapse", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Landroid/view/View$OnClickListener;", "start", "clazz", "Ljava/lang/Class;", "requestCode", "optionsCompat", "Landroidx/core/app/ActivityOptionsCompat;", "isClearTop", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;Ljava/lang/Integer;Landroidx/core/app/ActivityOptionsCompat;Z)V", ExifInterface.GPS_DIRECTION_TRUE, "(Landroidx/fragment/app/Fragment;Ljava/lang/Class;Landroid/os/Bundle;Ljava/lang/Integer;Landroidx/core/app/ActivityOptionsCompat;Z)V", "fwk-core_release"}, k = 2, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class ViewExtensionsKt {
    public static /* synthetic */ void navigate$default(Fragment fragment, int i, Bundle bundle, NavOptions navOptions, Navigator.Extras extras, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        if ((i2 & 4) != 0) {
            navOptions = null;
        }
        if ((i2 & 8) != 0) {
            extras = null;
        }
        navigate(fragment, i, bundle, navOptions, extras);
    }

    public static final void navigate(Fragment fragment, int i, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        try {
            FragmentKt.findNavController(fragment).navigate(i, bundle, navOptions, extras);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    public static final boolean navigateUp(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        try {
            return FragmentKt.findNavController(fragment).navigateUp();
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return false;
        }
    }

    public static final void finish(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    public static /* synthetic */ void start$default(Fragment fragment, Class cls, Bundle bundle, Integer num, ActivityOptionsCompat activityOptionsCompat, boolean z, int i, Object obj) {
        Bundle bundle2 = (i & 2) != 0 ? null : bundle;
        Integer num2 = (i & 4) != 0 ? null : num;
        ActivityOptionsCompat activityOptionsCompat2 = (i & 8) != 0 ? null : activityOptionsCompat;
        if ((i & 16) != 0) {
            z = false;
        }
        start(fragment, cls, bundle2, num2, activityOptionsCompat2, z);
    }

    public static final <T extends Activity> void start(Fragment fragment, Class<T> clazz, Bundle bundle, Integer num, ActivityOptionsCompat activityOptionsCompat, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Context context = fragment.getContext();
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) clazz);
        if (z) {
            intent.setFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (num != null) {
            fragment.startActivityForResult(intent, num.intValue(), activityOptionsCompat != null ? activityOptionsCompat.toBundle() : null);
        } else {
            fragment.startActivity(intent, activityOptionsCompat != null ? activityOptionsCompat.toBundle() : null);
        }
    }

    public static final void navigate(Activity activity, int i, int i2, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        try {
            ActivityKt.findNavController(activity, i).navigate(i2, bundle, navOptions, extras);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    public static /* synthetic */ void start$default(Activity activity, Class cls, Bundle bundle, Integer num, ActivityOptionsCompat activityOptionsCompat, boolean z, int i, Object obj) {
        Bundle bundle2 = (i & 2) != 0 ? null : bundle;
        Integer num2 = (i & 4) != 0 ? null : num;
        ActivityOptionsCompat activityOptionsCompat2 = (i & 8) != 0 ? null : activityOptionsCompat;
        if ((i & 16) != 0) {
            z = false;
        }
        start(activity, (Class<? extends Activity>) cls, bundle2, num2, activityOptionsCompat2, z);
    }

    public static final void start(Activity activity, Class<? extends Activity> clazz, Bundle bundle, Integer num, ActivityOptionsCompat activityOptionsCompat, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intent intent = new Intent(activity, clazz);
        if (z) {
            intent.setFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (num != null) {
            activity.startActivityForResult(intent, num.intValue(), activityOptionsCompat != null ? activityOptionsCompat.toBundle() : null);
        } else {
            activity.startActivity(intent, activityOptionsCompat != null ? activityOptionsCompat.toBundle() : null);
        }
    }

    public static final void setSingleClickListener(View view, long j, final Function1<? super View, Unit> listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        setSingleClickListener(view, j, new View.OnClickListener() { // from class: com.glority.android.core.ext.ViewExtensionsKt$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewExtensionsKt.m7739setSingleClickListener$lambda6(Function1.this, view2);
            }
        });
    }

    public static /* synthetic */ void setSingleClickListener$default(View view, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 600;
        }
        setSingleClickListener(view, j, (Function1<? super View, Unit>) function1);
    }

    /* renamed from: setSingleClickListener$lambda-6 */
    public static final void m7739setSingleClickListener$lambda6(Function1 listener, View view) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullExpressionValue(view, "view");
        listener.invoke(view);
    }

    public static /* synthetic */ void setSingleClickListener$default(View view, long j, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 600;
        }
        setSingleClickListener(view, j, onClickListener);
    }

    public static final void setSingleClickListener(View view, final long j, final View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (j <= 0 || onClickListener == null) {
            view.setOnClickListener(onClickListener);
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.core.ext.ViewExtensionsKt$setSingleClickListener$2
                private long lastClickTime;

                public final long getLastClickTime() {
                    return this.lastClickTime;
                }

                public final void setLastClickTime(long j2) {
                    this.lastClickTime = j2;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.lastClickTime > j) {
                        onClickListener.onClick(view2);
                        this.lastClickTime = currentTimeMillis;
                    }
                }
            });
        }
    }

    public static /* synthetic */ void setRipple$default(View view, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        setRipple(view, z);
    }

    public static final void setRipple(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(z ? R.attr.selectableItemBackgroundBorderless : R.attr.selectableItemBackground, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public static final void alphaEnable(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setAlpha(z ? 1.0f : 0.5f);
        view.setEnabled(z);
    }
}

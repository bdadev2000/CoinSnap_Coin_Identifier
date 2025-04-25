package com.glority.android.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityOptionsCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.glority.android.xx.constants.LogEvents;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentHelper.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\nJ\"\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0011\u001a\u00020\u0012J*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006\u0017"}, d2 = {"Lcom/glority/android/ui/base/FragmentHelper;", "", "()V", "clear", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "open", "Lcom/glority/android/ui/base/FragmentHelper$Builder;", "M", "Landroidx/fragment/app/Fragment;", "clz", "Ljava/lang/Class;", "pop", "remove", "fragment", "replace", "containerId", "", "id", "addToBackStack", "", "Builder", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class FragmentHelper {
    public static final FragmentHelper INSTANCE = new FragmentHelper();

    private FragmentHelper() {
    }

    public final void replace(AppCompatActivity activity, Fragment fragment, int containerId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        replace(activity, fragment, containerId, false);
    }

    public final void replace(AppCompatActivity activity, Fragment fragment, int id, boolean addToBackStack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "activity.supportFragmentManager.beginTransaction()");
        Intrinsics.checkNotNull(fragment);
        beginTransaction.replace(id, fragment);
        if (addToBackStack) {
            beginTransaction.addToBackStack(null);
        }
        beginTransaction.commitAllowingStateLoss();
    }

    public final void remove(AppCompatActivity activity, Fragment fragment) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "fm.beginTransaction()");
        Intrinsics.checkNotNull(fragment);
        beginTransaction.remove(fragment);
        beginTransaction.commit();
    }

    public final void clear(AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        supportFragmentManager.popBackStack((String) null, 1);
    }

    public final void pop(AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        if (supportFragmentManager.getFragments().size() > 1) {
            supportFragmentManager.popBackStackImmediate();
        } else {
            activity.finish();
        }
    }

    public final <M extends Fragment> Builder<M> open(Class<M> clz) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        return new Builder<>(clz);
    }

    /* compiled from: FragmentHelper.kt */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0000\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0003B\u0015\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000eJ-\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u001bJ-\u0010\u001c\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J+\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001e\u001a\u00020\u0014J\u0018\u0010\u001f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001e\u001a\u00020\u0014J \u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\bJ \u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010$\u001a\u0004\u0018\u00010%J \u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010&\u001a\u0004\u0018\u00010'J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010(\u001a\u00020)J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010(\u001a\u00020*J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010+\u001a\u00020\u0014J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010,\u001a\u00020-J \u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010.\u001a\u0004\u0018\u00010/J \u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010&\u001a\u0004\u0018\u00010\"R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u00060"}, d2 = {"Lcom/glority/android/ui/base/FragmentHelper$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "", "clz", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "bundle", "Landroid/os/Bundle;", "launchIntent", "Landroid/content/Intent;", "getLaunchIntent", "()Landroid/content/Intent;", LogEvents.exportemptyalert_close_click_type_get, "()Landroidx/fragment/app/Fragment;", "launch", "", "activity", "Landroid/app/Activity;", "requestCode", "", "optionsCompat", "Landroidx/core/app/ActivityOptionsCompat;", "(Landroid/app/Activity;Ljava/lang/Integer;Landroidx/core/app/ActivityOptionsCompat;)V", "context", "Landroid/content/Context;", "fragment", "(Landroidx/fragment/app/Fragment;Ljava/lang/Integer;Landroidx/core/app/ActivityOptionsCompat;)V", "launchNpsExclude", "launchWithFlags", "flags", "launchWithFlagsNpsExclude", "put", "key", "", "b", TtmlNode.TAG_P, "Landroid/os/Parcelable;", "s", "Ljava/io/Serializable;", "d", "", "", "i", "l", "", "ls", "", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes4.dex */
    public static final class Builder<T extends Fragment> {
        private final Bundle bundle = new Bundle();
        private final Class<T> clz;

        public Builder(Class<T> cls) {
            this.clz = cls;
        }

        public final Builder<T> put(String key, int i) {
            this.bundle.putInt(key, i);
            return this;
        }

        public final Builder<T> put(String key, long l) {
            this.bundle.putLong(key, l);
            return this;
        }

        public final Builder<T> put(String key, double d) {
            this.bundle.putDouble(key, d);
            return this;
        }

        public final Builder<T> put(String key, boolean d) {
            this.bundle.putBoolean(key, d);
            return this;
        }

        public final Builder<T> put(String key, long[] ls) {
            this.bundle.putLongArray(key, ls);
            return this;
        }

        public final Builder<T> put(String key, String s) {
            this.bundle.putString(key, s);
            return this;
        }

        public final Builder<T> put(String key, Serializable s) {
            this.bundle.putSerializable(key, s);
            return this;
        }

        public final Builder<T> put(String key, Parcelable p) {
            this.bundle.putParcelable(key, p);
            return this;
        }

        public final Builder<T> put(String key, Bundle b) {
            this.bundle.putBundle(key, b);
            return this;
        }

        public final T get() {
            try {
                Class<T> cls = this.clz;
                Intrinsics.checkNotNull(cls);
                T newInstance = cls.newInstance();
                Intrinsics.checkNotNull(newInstance);
                newInstance.setArguments(this.bundle);
                return newInstance;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InstantiationException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        private final Intent getLaunchIntent() {
            Intent intent = new Intent();
            intent.setAction(ContainerActivity.ACTION_OPEN_FRAGMENT);
            intent.putExtra(ContainerActivity.ACTION_OPEN_FRAGMENT_EXTRA_CLASS, this.clz);
            intent.putExtra(ContainerActivity.ACTION_OPEN_FRAGMENT_EXTRA_BUNDLE, this.bundle);
            return intent;
        }

        public final void launch(Context context) {
            if (this.clz == null) {
                throw new IllegalArgumentException("No destination found for ContainerActivity.".toString());
            }
            if (context == null) {
                throw new IllegalArgumentException("The launch context can't be null.".toString());
            }
            Intent launchIntent = getLaunchIntent();
            launchIntent.setClass(context, ContainerActivity.class);
            context.startActivity(launchIntent);
        }

        public final void launchNpsExclude(Context context) {
            if (this.clz == null) {
                throw new IllegalArgumentException("No destination found for ContainerActivity.".toString());
            }
            if (context == null) {
                throw new IllegalArgumentException("The launch context can't be null.".toString());
            }
            Intent launchIntent = getLaunchIntent();
            launchIntent.setClass(context, ExcludeNPSContainerActivity.class);
            context.startActivity(launchIntent);
        }

        public static /* synthetic */ void launch$default(Builder builder, Activity activity, Integer num, ActivityOptionsCompat activityOptionsCompat, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                activityOptionsCompat = null;
            }
            builder.launch(activity, num, activityOptionsCompat);
        }

        public final void launch(Activity activity, Integer requestCode, ActivityOptionsCompat optionsCompat) {
            if (this.clz == null) {
                throw new IllegalArgumentException("No destination found for ContainerActivity.".toString());
            }
            if (activity == null) {
                throw new IllegalArgumentException("The launch activity can't be null.".toString());
            }
            Intent launchIntent = getLaunchIntent();
            launchIntent.setClass(activity, ContainerActivity.class);
            if (requestCode != null) {
                activity.startActivityForResult(launchIntent, requestCode.intValue(), optionsCompat != null ? optionsCompat.toBundle() : null);
            } else {
                activity.startActivity(launchIntent, optionsCompat != null ? optionsCompat.toBundle() : null);
            }
        }

        public static /* synthetic */ void launchNpsExclude$default(Builder builder, Activity activity, Integer num, ActivityOptionsCompat activityOptionsCompat, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                activityOptionsCompat = null;
            }
            builder.launchNpsExclude(activity, num, activityOptionsCompat);
        }

        public final void launchNpsExclude(Activity activity, Integer requestCode, ActivityOptionsCompat optionsCompat) {
            if (this.clz == null) {
                throw new IllegalArgumentException("No destination found for ContainerActivity.".toString());
            }
            if (activity == null) {
                throw new IllegalArgumentException("The launch activity can't be null.".toString());
            }
            Intent launchIntent = getLaunchIntent();
            launchIntent.setClass(activity, ExcludeNPSContainerActivity.class);
            if (requestCode != null) {
                activity.startActivityForResult(launchIntent, requestCode.intValue(), optionsCompat != null ? optionsCompat.toBundle() : null);
            } else {
                activity.startActivity(launchIntent, optionsCompat != null ? optionsCompat.toBundle() : null);
            }
        }

        public static /* synthetic */ void launch$default(Builder builder, Fragment fragment, Integer num, ActivityOptionsCompat activityOptionsCompat, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                activityOptionsCompat = null;
            }
            builder.launch(fragment, num, activityOptionsCompat);
        }

        public final void launch(Fragment fragment, Integer requestCode, ActivityOptionsCompat optionsCompat) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            if (this.clz == null) {
                throw new IllegalArgumentException("No destination found for ContainerActivity.".toString());
            }
            Intent launchIntent = getLaunchIntent();
            launchIntent.setClass(fragment.requireContext(), ContainerActivity.class);
            if (requestCode != null) {
                fragment.startActivityForResult(launchIntent, requestCode.intValue(), optionsCompat != null ? optionsCompat.toBundle() : null);
            } else {
                fragment.startActivity(launchIntent, optionsCompat != null ? optionsCompat.toBundle() : null);
            }
        }

        public static /* synthetic */ void launchNpsExclude$default(Builder builder, Fragment fragment, Integer num, ActivityOptionsCompat activityOptionsCompat, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                activityOptionsCompat = null;
            }
            builder.launchNpsExclude(fragment, num, activityOptionsCompat);
        }

        public final void launchNpsExclude(Fragment fragment, Integer requestCode, ActivityOptionsCompat optionsCompat) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            if (this.clz == null) {
                throw new IllegalArgumentException("No destination found for ContainerActivity.".toString());
            }
            Intent launchIntent = getLaunchIntent();
            launchIntent.setClass(fragment.requireContext(), ExcludeNPSContainerActivity.class);
            if (requestCode != null) {
                fragment.startActivityForResult(launchIntent, requestCode.intValue(), optionsCompat != null ? optionsCompat.toBundle() : null);
            } else {
                fragment.startActivity(launchIntent, optionsCompat != null ? optionsCompat.toBundle() : null);
            }
        }

        public final void launchWithFlags(Activity activity, int flags) {
            if (this.clz == null) {
                throw new IllegalArgumentException("No destination found for ContainerActivity.".toString());
            }
            if (activity == null) {
                throw new IllegalArgumentException("The launch activity can't be null.".toString());
            }
            Intent launchIntent = getLaunchIntent();
            launchIntent.setClass(activity, ContainerActivity.class);
            launchIntent.setFlags(flags);
            activity.startActivity(launchIntent);
        }

        public final void launchWithFlagsNpsExclude(Activity activity, int flags) {
            if (this.clz == null) {
                throw new IllegalArgumentException("No destination found for ContainerActivity.".toString());
            }
            if (activity == null) {
                throw new IllegalArgumentException("The launch activity can't be null.".toString());
            }
            Intent launchIntent = getLaunchIntent();
            launchIntent.setClass(activity, ExcludeNPSContainerActivity.class);
            launchIntent.setFlags(flags);
            activity.startActivity(launchIntent);
        }
    }
}

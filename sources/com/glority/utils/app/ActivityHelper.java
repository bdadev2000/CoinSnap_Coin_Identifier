package com.glority.utils.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.glority.utils.UtilsApp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes9.dex */
public final class ActivityHelper {
    private static List<Activity> activities = new LinkedList();

    public static boolean isActivityExists(String str, String str2) {
        Intent intent = new Intent();
        intent.setClassName(str, str2);
        PackageManager packageManager = UtilsApp.getApp().getPackageManager();
        return (packageManager.resolveActivity(intent, 0) == null || intent.resolveActivity(packageManager) == null || packageManager.queryIntentActivities(intent, 0).size() == 0) ? false : true;
    }

    public static void start(Context context, Class<? extends Activity> cls) {
        context.startActivity(new Intent(context, cls));
    }

    public static void start(Activity activity, Class<? extends Activity> cls, int i) {
        activity.startActivityForResult(new Intent(activity, cls), i);
    }

    public static void start(Fragment fragment, Class<? extends Activity> cls, int i) {
        fragment.startActivityForResult(new Intent(fragment.getContext(), cls), i);
    }

    public static void startHomeActivity(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        context.startActivity(intent);
    }

    public static void finishActivity(Activity activity) {
        activity.finish();
    }

    public static void finishActivity(Activity activity, int i, int i2) {
        activity.finish();
    }

    public static <T extends Activity> Builder<T> open(Class<T> cls) {
        return new Builder<>(cls);
    }

    public static Builder open() {
        return new Builder();
    }

    /* loaded from: classes9.dex */
    public static class Builder<T extends Activity> {
        private Class<T> clz;
        private int enterAnim;
        private int exitAnim;
        private Intent intent = new Intent();
        private Bundle options;
        private View[] sharedElements;

        Builder() {
        }

        Builder(Class<T> cls) {
            this.clz = cls;
        }

        public Builder<T> setClass(Context context, Class<T> cls) {
            this.intent.setClass(context, cls);
            return this;
        }

        public Builder<T> setAction(String str) {
            this.intent.setAction(str);
            return this;
        }

        public Builder<T> setData(Uri uri) {
            this.intent.setData(uri);
            return this;
        }

        public Builder<T> setFlags(int i) {
            this.intent.setFlags(i);
            return this;
        }

        public Builder<T> setType(String str) {
            this.intent.setType(str);
            return this;
        }

        public Builder<T> addCategory(String str) {
            this.intent.addCategory(str);
            return this;
        }

        public Builder<T> put(String str, byte b) {
            this.intent.putExtra(str, b);
            return this;
        }

        public Builder<T> put(String str, char c) {
            this.intent.putExtra(str, c);
            return this;
        }

        public Builder<T> put(String str, short s) {
            this.intent.putExtra(str, s);
            return this;
        }

        public Builder<T> put(String str, int i) {
            this.intent.putExtra(str, i);
            return this;
        }

        public Builder<T> put(String str, long j) {
            this.intent.putExtra(str, j);
            return this;
        }

        public Builder<T> put(String str, float f) {
            this.intent.putExtra(str, f);
            return this;
        }

        public Builder<T> put(String str, double d) {
            this.intent.putExtra(str, d);
            return this;
        }

        public Builder<T> put(String str, String str2) {
            this.intent.putExtra(str, str2);
            return this;
        }

        public Builder<T> put(String str, CharSequence charSequence) {
            this.intent.putExtra(str, charSequence);
            return this;
        }

        public Builder<T> put(String str, Serializable serializable) {
            this.intent.putExtra(str, serializable);
            return this;
        }

        public Builder<T> put(String str, Parcelable parcelable) {
            this.intent.putExtra(str, parcelable);
            return this;
        }

        public Builder<T> put(String str, boolean[] zArr) {
            this.intent.putExtra(str, zArr);
            return this;
        }

        public Builder<T> put(String str, byte[] bArr) {
            this.intent.putExtra(str, bArr);
            return this;
        }

        public Builder<T> put(String str, short[] sArr) {
            this.intent.putExtra(str, sArr);
            return this;
        }

        public Builder<T> put(String str, char[] cArr) {
            this.intent.putExtra(str, cArr);
            return this;
        }

        public Builder<T> put(String str, int[] iArr) {
            this.intent.putExtra(str, iArr);
            return this;
        }

        public Builder<T> put(String str, long[] jArr) {
            this.intent.putExtra(str, jArr);
            return this;
        }

        public Builder<T> put(String str, float[] fArr) {
            this.intent.putExtra(str, fArr);
            return this;
        }

        public Builder<T> put(String str, double[] dArr) {
            this.intent.putExtra(str, dArr);
            return this;
        }

        public Builder<T> put(String str, String[] strArr) {
            this.intent.putExtra(str, strArr);
            return this;
        }

        public Builder<T> put(String str, CharSequence[] charSequenceArr) {
            this.intent.putExtra(str, charSequenceArr);
            return this;
        }

        public Builder<T> put(String str, Bundle bundle) {
            this.intent.putExtra(str, bundle);
            return this;
        }

        public Builder<T> put(String str, Parcelable[] parcelableArr) {
            this.intent.putExtra(str, parcelableArr);
            return this;
        }

        public Builder<T> putParcelableList(String str, ArrayList<? extends Parcelable> arrayList) {
            this.intent.putParcelableArrayListExtra(str, arrayList);
            return this;
        }

        public Builder<T> putIntegerList(String str, ArrayList<Integer> arrayList) {
            this.intent.putIntegerArrayListExtra(str, arrayList);
            return this;
        }

        public Builder<T> putStringList(String str, ArrayList<String> arrayList) {
            this.intent.putStringArrayListExtra(str, arrayList);
            return this;
        }

        public Builder<T> putCharSequenceList(String str, ArrayList<CharSequence> arrayList) {
            this.intent.putCharSequenceArrayListExtra(str, arrayList);
            return this;
        }

        public Builder<T> withAnim(int i, int i2) {
            this.enterAnim = i;
            this.exitAnim = i2;
            return this;
        }

        public Builder<T> wishSharedElements(View[] viewArr) {
            this.sharedElements = viewArr;
            return this;
        }

        public Builder<T> withOptions(Bundle bundle) {
            this.options = bundle;
            return this;
        }

        public Intent getIntent(Context context) {
            Class<T> cls = this.clz;
            if (cls != null) {
                this.intent.setClass(context, cls);
            }
            return this.intent;
        }

        public void launch(Context context) {
            View[] viewArr;
            Intent intent = getIntent(context);
            if (context instanceof Activity) {
                if (this.options == null && (viewArr = this.sharedElements) != null) {
                    this.options = getOptionsBundle((Activity) context, viewArr);
                }
                if (this.options != null) {
                    context.startActivity(intent, this.options);
                    return;
                } else {
                    context.startActivity(intent);
                    return;
                }
            }
            context.startActivity(intent);
        }

        public void launch(Activity activity, int i) {
            View[] viewArr;
            Intent intent = getIntent(activity);
            if (this.options == null && (viewArr = this.sharedElements) != null) {
                this.options = getOptionsBundle(activity, viewArr);
            }
            if (this.options != null) {
                activity.startActivityForResult(intent, i, this.options);
            } else {
                activity.startActivityForResult(intent, i);
            }
        }

        public void launch(Fragment fragment, int i) {
            View[] viewArr;
            FragmentActivity activity = fragment.getActivity();
            Intent intent = getIntent(activity);
            if (this.options == null && (viewArr = this.sharedElements) != null) {
                this.options = getOptionsBundle(activity, viewArr);
            }
            if (this.options != null) {
                fragment.startActivityForResult(intent, i, this.options);
            } else {
                fragment.startActivityForResult(intent, i);
            }
        }

        private Bundle getOptionsBundle(Activity activity, View[] viewArr) {
            int length;
            if (viewArr == null || (length = viewArr.length) <= 0) {
                return null;
            }
            Pair[] pairArr = new Pair[length];
            for (int i = 0; i < length; i++) {
                View view = viewArr[i];
                pairArr[i] = Pair.create(view, view.getTransitionName());
            }
            return ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pairArr).toBundle();
        }
    }

    public static void addToList(Activity activity) {
        activities.add(activity);
    }

    public static void removeFromList(Activity activity) {
        if (activities.indexOf(activity) != -1) {
            activities.remove(activity);
        }
    }

    public static Activity currentActivity() {
        return activities.get(0);
    }

    public static void finishAll() {
        Iterator<Activity> it = activities.iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
    }

    private ActivityHelper() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}

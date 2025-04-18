package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.cooldev.gba.emulator.gameboy.R;
import com.facebook.internal.security.CertificateUtil;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.g0;

/* loaded from: classes.dex */
public abstract class FragmentManager implements FragmentResultOwner {
    public ActivityResultLauncher B;
    public ActivityResultLauncher C;
    public ActivityResultLauncher D;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList K;
    public ArrayList L;
    public ArrayList M;
    public FragmentManagerViewModel N;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19740b;
    public ArrayList d;
    public ArrayList e;

    /* renamed from: g, reason: collision with root package name */
    public OnBackPressedDispatcher f19743g;

    /* renamed from: o, reason: collision with root package name */
    public final h f19751o;

    /* renamed from: p, reason: collision with root package name */
    public final h f19752p;

    /* renamed from: q, reason: collision with root package name */
    public final h f19753q;

    /* renamed from: r, reason: collision with root package name */
    public final h f19754r;

    /* renamed from: u, reason: collision with root package name */
    public FragmentHostCallback f19757u;

    /* renamed from: v, reason: collision with root package name */
    public FragmentContainer f19758v;
    public Fragment w;
    public Fragment x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19739a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final FragmentStore f19741c = new FragmentStore();

    /* renamed from: f, reason: collision with root package name */
    public final FragmentLayoutInflaterFactory f19742f = new FragmentLayoutInflaterFactory(this);

    /* renamed from: h, reason: collision with root package name */
    public final OnBackPressedCallback f19744h = new OnBackPressedCallback() { // from class: androidx.fragment.app.FragmentManager.1
        @Override // androidx.activity.OnBackPressedCallback
        public final void b() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.y(true);
            if (fragmentManager.f19744h.f163a) {
                fragmentManager.O();
            } else {
                fragmentManager.f19743g.c();
            }
        }
    };

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f19745i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f19746j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f19747k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map f19748l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final FragmentLifecycleCallbacksDispatcher f19749m = new FragmentLifecycleCallbacksDispatcher(this);

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f19750n = new CopyOnWriteArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final MenuProvider f19755s = new MenuProvider() { // from class: androidx.fragment.app.FragmentManager.2
        @Override // androidx.core.view.MenuProvider
        public final void a(Menu menu) {
            FragmentManager.this.q(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public final void b(Menu menu) {
            FragmentManager.this.t(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public final boolean c(MenuItem menuItem) {
            return FragmentManager.this.p(menuItem);
        }

        @Override // androidx.core.view.MenuProvider
        public final void d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.k(menu, menuInflater);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    public int f19756t = -1;

    /* renamed from: y, reason: collision with root package name */
    public FragmentFactory f19759y = null;

    /* renamed from: z, reason: collision with root package name */
    public final FragmentFactory f19760z = new FragmentFactory() { // from class: androidx.fragment.app.FragmentManager.3
        @Override // androidx.fragment.app.FragmentFactory
        public final Fragment instantiate(ClassLoader classLoader, String str) {
            FragmentHostCallback fragmentHostCallback = FragmentManager.this.f19757u;
            Context context = fragmentHostCallback.f19732b;
            fragmentHostCallback.getClass();
            return Fragment.instantiate(context, str, null);
        }
    };
    public final AnonymousClass4 A = new Object();
    public ArrayDeque E = new ArrayDeque();
    public final Runnable O = new Runnable() { // from class: androidx.fragment.app.FragmentManager.5
        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.y(true);
        }
    };

    /* renamed from: androidx.fragment.app.FragmentManager$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements SpecialEffectsControllerFactory {
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.SpecialEffectsController, androidx.fragment.app.DefaultSpecialEffectsController] */
        @Override // androidx.fragment.app.SpecialEffectsControllerFactory
        public final DefaultSpecialEffectsController a(ViewGroup viewGroup) {
            p0.a.s(viewGroup, "container");
            return new SpecialEffectsController(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$6, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass6 implements LifecycleEventObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                throw null;
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                throw null;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface BackStackEntry {
    }

    /* loaded from: classes.dex */
    public class ClearBackStackState implements OpGenerator {
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class FragmentIntentSenderContract extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest.f298b;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSenderRequest.Builder builder = new IntentSenderRequest.Builder(intentSenderRequest.f297a);
                    builder.f301b = null;
                    builder.d = intentSenderRequest.d;
                    builder.f302c = intentSenderRequest.f299c;
                    intentSenderRequest = builder.a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class FragmentLifecycleCallbacks {
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public String f19768a;

        /* renamed from: b, reason: collision with root package name */
        public int f19769b;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Parcelable.Creator<LaunchedFragmentInfo> {
            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.FragmentManager$LaunchedFragmentInfo, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                ?? obj = new Object();
                obj.f19768a = parcel.readString();
                obj.f19769b = parcel.readInt();
                return obj;
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo[] newArray(int i2) {
                return new LaunchedFragmentInfo[i2];
            }
        }

        public LaunchedFragmentInfo(String str, int i2) {
            this.f19768a = str;
            this.f19769b = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f19768a);
            parcel.writeInt(this.f19769b);
        }
    }

    /* loaded from: classes.dex */
    public static class LifecycleAwareResultListener implements FragmentResultListener {
    }

    /* loaded from: classes.dex */
    public interface OnBackStackChangedListener {
    }

    /* loaded from: classes.dex */
    public interface OpGenerator {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* loaded from: classes.dex */
    public class PopBackStackState implements OpGenerator {

        /* renamed from: b, reason: collision with root package name */
        public final int f19771b;

        /* renamed from: a, reason: collision with root package name */
        public final String f19770a = null;

        /* renamed from: c, reason: collision with root package name */
        public final int f19772c = 1;

        public PopBackStackState(int i2) {
            this.f19771b = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManager.this.x;
            if (fragment == null || this.f19771b >= 0 || this.f19770a != null || !fragment.getChildFragmentManager().O()) {
                return FragmentManager.this.Q(arrayList, arrayList2, this.f19770a, this.f19771b, this.f19772c);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class RestoreBackStackState implements OpGenerator {
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class SaveBackStackState implements OpGenerator {
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.h] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.h] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.h] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.h] */
    /* JADX WARN: Type inference failed for: r0v21, types: [androidx.fragment.app.FragmentManager$4, java.lang.Object] */
    public FragmentManager() {
        final int i2 = 0;
        this.f19751o = new Consumer(this) { // from class: androidx.fragment.app.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f19895b;

            {
                this.f19895b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i3 = i2;
                FragmentManager fragmentManager = this.f19895b;
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.K()) {
                            fragmentManager.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (fragmentManager.K() && num.intValue() == 80) {
                            fragmentManager.m(false);
                            return;
                        }
                        return;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        if (fragmentManager.K()) {
                            fragmentManager.n(multiWindowModeChangedInfo.f18412a, false);
                            return;
                        }
                        return;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        if (fragmentManager.K()) {
                            fragmentManager.s(pictureInPictureModeChangedInfo.f18463a, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i3 = 1;
        this.f19752p = new Consumer(this) { // from class: androidx.fragment.app.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f19895b;

            {
                this.f19895b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i32 = i3;
                FragmentManager fragmentManager = this.f19895b;
                switch (i32) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.K()) {
                            fragmentManager.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (fragmentManager.K() && num.intValue() == 80) {
                            fragmentManager.m(false);
                            return;
                        }
                        return;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        if (fragmentManager.K()) {
                            fragmentManager.n(multiWindowModeChangedInfo.f18412a, false);
                            return;
                        }
                        return;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        if (fragmentManager.K()) {
                            fragmentManager.s(pictureInPictureModeChangedInfo.f18463a, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i4 = 2;
        this.f19753q = new Consumer(this) { // from class: androidx.fragment.app.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f19895b;

            {
                this.f19895b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i32 = i4;
                FragmentManager fragmentManager = this.f19895b;
                switch (i32) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.K()) {
                            fragmentManager.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (fragmentManager.K() && num.intValue() == 80) {
                            fragmentManager.m(false);
                            return;
                        }
                        return;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        if (fragmentManager.K()) {
                            fragmentManager.n(multiWindowModeChangedInfo.f18412a, false);
                            return;
                        }
                        return;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        if (fragmentManager.K()) {
                            fragmentManager.s(pictureInPictureModeChangedInfo.f18463a, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i5 = 3;
        this.f19754r = new Consumer(this) { // from class: androidx.fragment.app.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f19895b;

            {
                this.f19895b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i32 = i5;
                FragmentManager fragmentManager = this.f19895b;
                switch (i32) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.K()) {
                            fragmentManager.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (fragmentManager.K() && num.intValue() == 80) {
                            fragmentManager.m(false);
                            return;
                        }
                        return;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        if (fragmentManager.K()) {
                            fragmentManager.n(multiWindowModeChangedInfo.f18412a, false);
                            return;
                        }
                        return;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        if (fragmentManager.K()) {
                            fragmentManager.s(pictureInPictureModeChangedInfo.f18463a, false);
                            return;
                        }
                        return;
                }
            }
        };
    }

    public static boolean J(Fragment fragment) {
        if (!fragment.mHasMenu || !fragment.mMenuVisible) {
            Iterator it = fragment.mChildFragmentManager.f19741c.e().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null) {
                    z2 = J(fragment2);
                }
                if (z2) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean L(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.x) && L(fragmentManager.w);
    }

    public static void a0(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:132:0x0225. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:159:0x02eb. Please report as an issue. */
    public final void A(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        FragmentStore fragmentStore;
        FragmentStore fragmentStore2;
        FragmentStore fragmentStore3;
        int i4;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z2 = ((BackStackRecord) arrayList3.get(i2)).f19820o;
        ArrayList arrayList5 = this.M;
        if (arrayList5 == null) {
            this.M = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.M;
        FragmentStore fragmentStore4 = this.f19741c;
        arrayList6.addAll(fragmentStore4.f());
        Fragment fragment = this.x;
        int i5 = i2;
        boolean z3 = false;
        while (true) {
            int i6 = 1;
            if (i5 >= i3) {
                FragmentStore fragmentStore5 = fragmentStore4;
                this.M.clear();
                if (!z2 && this.f19756t >= 1) {
                    for (int i7 = i2; i7 < i3; i7++) {
                        Iterator it = ((BackStackRecord) arrayList.get(i7)).f19808a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = ((FragmentTransaction.Op) it.next()).f19822b;
                            if (fragment2 == null || fragment2.mFragmentManager == null) {
                                fragmentStore = fragmentStore5;
                            } else {
                                fragmentStore = fragmentStore5;
                                fragmentStore.g(g(fragment2));
                            }
                            fragmentStore5 = fragmentStore;
                        }
                    }
                }
                for (int i8 = i2; i8 < i3; i8++) {
                    BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i8);
                    if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                        backStackRecord.h(-1);
                        ArrayList arrayList7 = backStackRecord.f19808a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            FragmentTransaction.Op op = (FragmentTransaction.Op) arrayList7.get(size);
                            Fragment fragment3 = op.f19822b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = backStackRecord.f19654s;
                                fragment3.setPopDirection(z4);
                                int i9 = backStackRecord.f19811f;
                                int i10 = 8194;
                                int i11 = 4097;
                                if (i9 != 4097) {
                                    if (i9 != 8194) {
                                        i10 = 4100;
                                        i11 = 8197;
                                        if (i9 != 8197) {
                                            if (i9 == 4099) {
                                                i10 = 4099;
                                            } else if (i9 != 4100) {
                                                i10 = 0;
                                            }
                                        }
                                    }
                                    i10 = i11;
                                }
                                fragment3.setNextTransition(i10);
                                fragment3.setSharedElementNames(backStackRecord.f19819n, backStackRecord.f19818m);
                            }
                            int i12 = op.f19821a;
                            FragmentManager fragmentManager = backStackRecord.f19651p;
                            switch (i12) {
                                case 1:
                                    fragment3.setAnimations(op.d, op.e, op.f19824f, op.f19825g);
                                    z4 = true;
                                    fragmentManager.W(fragment3, true);
                                    fragmentManager.R(fragment3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + op.f19821a);
                                case 3:
                                    fragment3.setAnimations(op.d, op.e, op.f19824f, op.f19825g);
                                    fragmentManager.a(fragment3);
                                    z4 = true;
                                case 4:
                                    fragment3.setAnimations(op.d, op.e, op.f19824f, op.f19825g);
                                    fragmentManager.getClass();
                                    a0(fragment3);
                                    z4 = true;
                                case 5:
                                    fragment3.setAnimations(op.d, op.e, op.f19824f, op.f19825g);
                                    fragmentManager.W(fragment3, true);
                                    fragmentManager.I(fragment3);
                                    z4 = true;
                                case 6:
                                    fragment3.setAnimations(op.d, op.e, op.f19824f, op.f19825g);
                                    fragmentManager.c(fragment3);
                                    z4 = true;
                                case 7:
                                    fragment3.setAnimations(op.d, op.e, op.f19824f, op.f19825g);
                                    fragmentManager.W(fragment3, true);
                                    fragmentManager.h(fragment3);
                                    z4 = true;
                                case 8:
                                    fragmentManager.Y(null);
                                    z4 = true;
                                case 9:
                                    fragmentManager.Y(fragment3);
                                    z4 = true;
                                case 10:
                                    fragmentManager.X(fragment3, op.f19826h);
                                    z4 = true;
                            }
                        }
                    } else {
                        backStackRecord.h(1);
                        ArrayList arrayList8 = backStackRecord.f19808a;
                        int size2 = arrayList8.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            FragmentTransaction.Op op2 = (FragmentTransaction.Op) arrayList8.get(i13);
                            Fragment fragment4 = op2.f19822b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = backStackRecord.f19654s;
                                fragment4.setPopDirection(false);
                                fragment4.setNextTransition(backStackRecord.f19811f);
                                fragment4.setSharedElementNames(backStackRecord.f19818m, backStackRecord.f19819n);
                            }
                            int i14 = op2.f19821a;
                            FragmentManager fragmentManager2 = backStackRecord.f19651p;
                            switch (i14) {
                                case 1:
                                    fragment4.setAnimations(op2.d, op2.e, op2.f19824f, op2.f19825g);
                                    fragmentManager2.W(fragment4, false);
                                    fragmentManager2.a(fragment4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + op2.f19821a);
                                case 3:
                                    fragment4.setAnimations(op2.d, op2.e, op2.f19824f, op2.f19825g);
                                    fragmentManager2.R(fragment4);
                                case 4:
                                    fragment4.setAnimations(op2.d, op2.e, op2.f19824f, op2.f19825g);
                                    fragmentManager2.I(fragment4);
                                case 5:
                                    fragment4.setAnimations(op2.d, op2.e, op2.f19824f, op2.f19825g);
                                    fragmentManager2.W(fragment4, false);
                                    a0(fragment4);
                                case 6:
                                    fragment4.setAnimations(op2.d, op2.e, op2.f19824f, op2.f19825g);
                                    fragmentManager2.h(fragment4);
                                case 7:
                                    fragment4.setAnimations(op2.d, op2.e, op2.f19824f, op2.f19825g);
                                    fragmentManager2.W(fragment4, false);
                                    fragmentManager2.c(fragment4);
                                case 8:
                                    fragmentManager2.Y(fragment4);
                                case 9:
                                    fragmentManager2.Y(null);
                                case 10:
                                    fragmentManager2.X(fragment4, op2.f19827i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i3 - 1)).booleanValue();
                for (int i15 = i2; i15 < i3; i15++) {
                    BackStackRecord backStackRecord2 = (BackStackRecord) arrayList.get(i15);
                    if (booleanValue) {
                        for (int size3 = backStackRecord2.f19808a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment5 = ((FragmentTransaction.Op) backStackRecord2.f19808a.get(size3)).f19822b;
                            if (fragment5 != null) {
                                g(fragment5).k();
                            }
                        }
                    } else {
                        Iterator it2 = backStackRecord2.f19808a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment6 = ((FragmentTransaction.Op) it2.next()).f19822b;
                            if (fragment6 != null) {
                                g(fragment6).k();
                            }
                        }
                    }
                }
                M(this.f19756t, true);
                HashSet hashSet = new HashSet();
                for (int i16 = i2; i16 < i3; i16++) {
                    Iterator it3 = ((BackStackRecord) arrayList.get(i16)).f19808a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment7 = ((FragmentTransaction.Op) it3.next()).f19822b;
                        if (fragment7 != null && (viewGroup = fragment7.mContainer) != null) {
                            hashSet.add(SpecialEffectsController.j(viewGroup, this));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    SpecialEffectsController specialEffectsController = (SpecialEffectsController) it4.next();
                    specialEffectsController.d = booleanValue;
                    specialEffectsController.k();
                    specialEffectsController.g();
                }
                for (int i17 = i2; i17 < i3; i17++) {
                    BackStackRecord backStackRecord3 = (BackStackRecord) arrayList.get(i17);
                    if (((Boolean) arrayList2.get(i17)).booleanValue() && backStackRecord3.f19653r >= 0) {
                        backStackRecord3.f19653r = -1;
                    }
                    backStackRecord3.getClass();
                }
                return;
            }
            BackStackRecord backStackRecord4 = (BackStackRecord) arrayList3.get(i5);
            if (((Boolean) arrayList4.get(i5)).booleanValue()) {
                fragmentStore2 = fragmentStore4;
                int i18 = 1;
                ArrayList arrayList9 = this.M;
                ArrayList arrayList10 = backStackRecord4.f19808a;
                int size4 = arrayList10.size() - 1;
                while (size4 >= 0) {
                    FragmentTransaction.Op op3 = (FragmentTransaction.Op) arrayList10.get(size4);
                    int i19 = op3.f19821a;
                    if (i19 != i18) {
                        if (i19 != 3) {
                            switch (i19) {
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = op3.f19822b;
                                    break;
                                case 10:
                                    op3.f19827i = op3.f19826h;
                                    break;
                            }
                            size4--;
                            i18 = 1;
                        }
                        arrayList9.add(op3.f19822b);
                        size4--;
                        i18 = 1;
                    }
                    arrayList9.remove(op3.f19822b);
                    size4--;
                    i18 = 1;
                }
            } else {
                ArrayList arrayList11 = this.M;
                int i20 = 0;
                while (true) {
                    ArrayList arrayList12 = backStackRecord4.f19808a;
                    if (i20 < arrayList12.size()) {
                        FragmentTransaction.Op op4 = (FragmentTransaction.Op) arrayList12.get(i20);
                        int i21 = op4.f19821a;
                        if (i21 != i6) {
                            if (i21 != 2) {
                                if (i21 == 3 || i21 == 6) {
                                    arrayList11.remove(op4.f19822b);
                                    Fragment fragment8 = op4.f19822b;
                                    if (fragment8 == fragment) {
                                        arrayList12.add(i20, new FragmentTransaction.Op(fragment8, 9));
                                        i20++;
                                        fragmentStore3 = fragmentStore4;
                                        i4 = 1;
                                        fragment = null;
                                    }
                                } else if (i21 == 7) {
                                    fragmentStore3 = fragmentStore4;
                                    i4 = 1;
                                } else if (i21 == 8) {
                                    arrayList12.add(i20, new FragmentTransaction.Op(9, fragment));
                                    op4.f19823c = true;
                                    i20++;
                                    fragment = op4.f19822b;
                                }
                                fragmentStore3 = fragmentStore4;
                                i4 = 1;
                            } else {
                                Fragment fragment9 = op4.f19822b;
                                int i22 = fragment9.mContainerId;
                                int size5 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size5 >= 0) {
                                    FragmentStore fragmentStore6 = fragmentStore4;
                                    Fragment fragment10 = (Fragment) arrayList11.get(size5);
                                    if (fragment10.mContainerId == i22) {
                                        if (fragment10 == fragment9) {
                                            z5 = true;
                                        } else {
                                            if (fragment10 == fragment) {
                                                arrayList12.add(i20, new FragmentTransaction.Op(9, fragment10));
                                                i20++;
                                                fragment = null;
                                            }
                                            FragmentTransaction.Op op5 = new FragmentTransaction.Op(3, fragment10);
                                            op5.d = op4.d;
                                            op5.f19824f = op4.f19824f;
                                            op5.e = op4.e;
                                            op5.f19825g = op4.f19825g;
                                            arrayList12.add(i20, op5);
                                            arrayList11.remove(fragment10);
                                            i20++;
                                            fragment = fragment;
                                        }
                                    }
                                    size5--;
                                    fragmentStore4 = fragmentStore6;
                                }
                                fragmentStore3 = fragmentStore4;
                                i4 = 1;
                                if (z5) {
                                    arrayList12.remove(i20);
                                    i20--;
                                } else {
                                    op4.f19821a = 1;
                                    op4.f19823c = true;
                                    arrayList11.add(fragment9);
                                }
                            }
                            i20 += i4;
                            i6 = i4;
                            fragmentStore4 = fragmentStore3;
                        } else {
                            fragmentStore3 = fragmentStore4;
                            i4 = i6;
                        }
                        arrayList11.add(op4.f19822b);
                        i20 += i4;
                        i6 = i4;
                        fragmentStore4 = fragmentStore3;
                    } else {
                        fragmentStore2 = fragmentStore4;
                    }
                }
            }
            z3 = z3 || backStackRecord4.f19812g;
            i5++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            fragmentStore4 = fragmentStore2;
        }
    }

    public final int B(String str, int i2, boolean z2) {
        ArrayList arrayList = this.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z2) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            BackStackRecord backStackRecord = (BackStackRecord) this.d.get(size);
            if ((str != null && str.equals(backStackRecord.f19813h)) || (i2 >= 0 && i2 == backStackRecord.f19653r)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z2) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            BackStackRecord backStackRecord2 = (BackStackRecord) this.d.get(size - 1);
            if ((str == null || !str.equals(backStackRecord2.f19813h)) && (i2 < 0 || i2 != backStackRecord2.f19653r)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public final Fragment C(int i2) {
        FragmentStore fragmentStore = this.f19741c;
        ArrayList arrayList = fragmentStore.f19803a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (FragmentStateManager fragmentStateManager : fragmentStore.f19804b.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment2 = fragmentStateManager.f19800c;
                if (fragment2.mFragmentId == i2) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment D(String str) {
        FragmentStore fragmentStore = this.f19741c;
        ArrayList arrayList = fragmentStore.f19803a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && str.equals(fragment.mTag)) {
                return fragment;
            }
        }
        for (FragmentStateManager fragmentStateManager : fragmentStore.f19804b.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment2 = fragmentStateManager.f19800c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
            if (specialEffectsController.e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                specialEffectsController.e = false;
                specialEffectsController.g();
            }
        }
    }

    public final ViewGroup F(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f19758v.c()) {
            View b2 = this.f19758v.b(fragment.mContainerId);
            if (b2 instanceof ViewGroup) {
                return (ViewGroup) b2;
            }
        }
        return null;
    }

    public final FragmentFactory G() {
        FragmentFactory fragmentFactory = this.f19759y;
        if (fragmentFactory != null) {
            return fragmentFactory;
        }
        Fragment fragment = this.w;
        return fragment != null ? fragment.mFragmentManager.G() : this.f19760z;
    }

    public final SpecialEffectsControllerFactory H() {
        Fragment fragment = this.w;
        return fragment != null ? fragment.mFragmentManager.H() : this.A;
    }

    public final void I(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        Z(fragment);
    }

    public final boolean K() {
        Fragment fragment = this.w;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.w.getParentFragmentManager().K();
    }

    public final void M(int i2, boolean z2) {
        HashMap hashMap;
        FragmentHostCallback fragmentHostCallback;
        if (this.f19757u == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.f19756t) {
            this.f19756t = i2;
            FragmentStore fragmentStore = this.f19741c;
            Iterator it = fragmentStore.f19803a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = fragmentStore.f19804b;
                if (!hasNext) {
                    break;
                }
                FragmentStateManager fragmentStateManager = (FragmentStateManager) hashMap.get(((Fragment) it.next()).mWho);
                if (fragmentStateManager != null) {
                    fragmentStateManager.k();
                }
            }
            for (FragmentStateManager fragmentStateManager2 : hashMap.values()) {
                if (fragmentStateManager2 != null) {
                    fragmentStateManager2.k();
                    Fragment fragment = fragmentStateManager2.f19800c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !fragmentStore.f19805c.containsKey(fragment.mWho)) {
                            fragmentStore.i(fragmentStateManager2.n(), fragment.mWho);
                        }
                        fragmentStore.h(fragmentStateManager2);
                    }
                }
            }
            Iterator it2 = fragmentStore.d().iterator();
            while (it2.hasNext()) {
                FragmentStateManager fragmentStateManager3 = (FragmentStateManager) it2.next();
                Fragment fragment2 = fragmentStateManager3.f19800c;
                if (fragment2.mDeferStart) {
                    if (this.f19740b) {
                        this.J = true;
                    } else {
                        fragment2.mDeferStart = false;
                        fragmentStateManager3.k();
                    }
                }
            }
            if (this.F && (fragmentHostCallback = this.f19757u) != null && this.f19756t == 7) {
                fragmentHostCallback.h();
                this.F = false;
            }
        }
    }

    public final void N() {
        if (this.f19757u == null) {
            return;
        }
        this.G = false;
        this.H = false;
        this.N.f19784g = false;
        for (Fragment fragment : this.f19741c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean O() {
        return P(-1, 0);
    }

    public final boolean P(int i2, int i3) {
        y(false);
        x(true);
        Fragment fragment = this.x;
        if (fragment != null && i2 < 0 && fragment.getChildFragmentManager().P(-1, 0)) {
            return true;
        }
        boolean Q = Q(this.K, this.L, null, i2, i3);
        if (Q) {
            this.f19740b = true;
            try {
                S(this.K, this.L);
            } finally {
                e();
            }
        }
        c0();
        boolean z2 = this.J;
        FragmentStore fragmentStore = this.f19741c;
        if (z2) {
            this.J = false;
            Iterator it = fragmentStore.d().iterator();
            while (it.hasNext()) {
                FragmentStateManager fragmentStateManager = (FragmentStateManager) it.next();
                Fragment fragment2 = fragmentStateManager.f19800c;
                if (fragment2.mDeferStart) {
                    if (this.f19740b) {
                        this.J = true;
                    } else {
                        fragment2.mDeferStart = false;
                        fragmentStateManager.k();
                    }
                }
            }
        }
        fragmentStore.f19804b.values().removeAll(Collections.singleton(null));
        return Q;
    }

    public final boolean Q(ArrayList arrayList, ArrayList arrayList2, String str, int i2, int i3) {
        int B = B(str, i2, (i3 & 1) != 0);
        if (B < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= B; size--) {
            arrayList.add((BackStackRecord) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void R(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z2 = !fragment.isInBackStack();
        if (!fragment.mDetached || z2) {
            FragmentStore fragmentStore = this.f19741c;
            synchronized (fragmentStore.f19803a) {
                fragmentStore.f19803a.remove(fragment);
            }
            fragment.mAdded = false;
            if (J(fragment)) {
                this.F = true;
            }
            fragment.mRemoving = true;
            Z(fragment);
        }
    }

    public final void S(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!((BackStackRecord) arrayList.get(i2)).f19820o) {
                if (i3 != i2) {
                    A(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                    while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((BackStackRecord) arrayList.get(i3)).f19820o) {
                        i3++;
                    }
                }
                A(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            A(arrayList, arrayList2, i3, size);
        }
    }

    public final void T(Bundle bundle) {
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher;
        FragmentStateManager fragmentStateManager;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f19757u.f19732b.getClassLoader());
                this.f19747k.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f19757u.f19732b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        FragmentStore fragmentStore = this.f19741c;
        HashMap hashMap2 = fragmentStore.f19805c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        HashMap hashMap3 = fragmentStore.f19804b;
        hashMap3.clear();
        Iterator it = fragmentManagerState.f19773a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fragmentLifecycleCallbacksDispatcher = this.f19749m;
            if (!hasNext) {
                break;
            }
            Bundle i2 = fragmentStore.i(null, (String) it.next());
            if (i2 != null) {
                Fragment fragment = (Fragment) this.N.f19781b.get(((FragmentState) i2.getParcelable("state")).f19786b);
                if (fragment != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    fragmentStateManager = new FragmentStateManager(fragmentLifecycleCallbacksDispatcher, fragmentStore, fragment, i2);
                } else {
                    fragmentStateManager = new FragmentStateManager(this.f19749m, this.f19741c, this.f19757u.f19732b.getClassLoader(), G(), i2);
                }
                Fragment fragment2 = fragmentStateManager.f19800c;
                fragment2.mSavedFragmentState = i2;
                fragment2.mFragmentManager = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                fragmentStateManager.l(this.f19757u.f19732b.getClassLoader());
                fragmentStore.g(fragmentStateManager);
                fragmentStateManager.e = this.f19756t;
            }
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.N;
        fragmentManagerViewModel.getClass();
        Iterator it2 = new ArrayList(fragmentManagerViewModel.f19781b.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (hashMap3.get(fragment3.mWho) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f19773a);
                }
                this.N.f(fragment3);
                fragment3.mFragmentManager = this;
                FragmentStateManager fragmentStateManager2 = new FragmentStateManager(fragmentLifecycleCallbacksDispatcher, fragmentStore, fragment3);
                fragmentStateManager2.e = 1;
                fragmentStateManager2.k();
                fragment3.mRemoving = true;
                fragmentStateManager2.k();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f19774b;
        fragmentStore.f19803a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment b2 = fragmentStore.b(str3);
                if (b2 == null) {
                    throw new IllegalStateException(androidx.compose.foundation.text.input.a.A("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b2);
                }
                fragmentStore.a(b2);
            }
        }
        if (fragmentManagerState.f19775c != null) {
            this.d = new ArrayList(fragmentManagerState.f19775c.length);
            int i3 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f19775c;
                if (i3 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i3];
                backStackRecordState.getClass();
                BackStackRecord backStackRecord = new BackStackRecord(this);
                backStackRecordState.b(backStackRecord);
                backStackRecord.f19653r = backStackRecordState.f19660h;
                int i4 = 0;
                while (true) {
                    ArrayList arrayList2 = backStackRecordState.f19656b;
                    if (i4 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i4);
                    if (str4 != null) {
                        ((FragmentTransaction.Op) backStackRecord.f19808a.get(i4)).f19822b = fragmentStore.b(str4);
                    }
                    i4++;
                }
                backStackRecord.h(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder t2 = android.support.v4.media.d.t("restoreAllState: back stack #", i3, " (index ");
                    t2.append(backStackRecord.f19653r);
                    t2.append("): ");
                    t2.append(backStackRecord);
                    Log.v("FragmentManager", t2.toString());
                    PrintWriter printWriter = new PrintWriter(new LogWriter());
                    backStackRecord.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(backStackRecord);
                i3++;
            }
        } else {
            this.d = null;
        }
        this.f19745i.set(fragmentManagerState.d);
        String str5 = fragmentManagerState.f19776f;
        if (str5 != null) {
            Fragment b3 = fragmentStore.b(str5);
            this.x = b3;
            r(b3);
        }
        ArrayList arrayList3 = fragmentManagerState.f19777g;
        if (arrayList3 != null) {
            for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                this.f19746j.put((String) arrayList3.get(i5), (BackStackState) fragmentManagerState.f19778h.get(i5));
            }
        }
        this.E = new ArrayDeque(fragmentManagerState.f19779i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.os.Parcelable, androidx.fragment.app.FragmentManagerState, java.lang.Object] */
    public final Bundle U() {
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        E();
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).i();
        }
        y(true);
        this.G = true;
        this.N.f19784g = true;
        FragmentStore fragmentStore = this.f19741c;
        fragmentStore.getClass();
        HashMap hashMap = fragmentStore.f19804b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (FragmentStateManager fragmentStateManager : hashMap.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment = fragmentStateManager.f19800c;
                fragmentStore.i(fragmentStateManager.n(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.f19741c.f19805c;
        if (!hashMap2.isEmpty()) {
            FragmentStore fragmentStore2 = this.f19741c;
            synchronized (fragmentStore2.f19803a) {
                try {
                    if (fragmentStore2.f19803a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(fragmentStore2.f19803a.size());
                        Iterator it2 = fragmentStore2.f19803a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment2 = (Fragment) it2.next();
                            arrayList.add(fragment2.mWho);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i2 = 0; i2 < size; i2++) {
                    backStackRecordStateArr[i2] = new BackStackRecordState((BackStackRecord) this.d.get(i2));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder t2 = android.support.v4.media.d.t("saveAllState: adding back stack #", i2, ": ");
                        t2.append(this.d.get(i2));
                        Log.v("FragmentManager", t2.toString());
                    }
                }
            }
            ?? obj = new Object();
            obj.f19776f = null;
            ArrayList arrayList4 = new ArrayList();
            obj.f19777g = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            obj.f19778h = arrayList5;
            obj.f19773a = arrayList2;
            obj.f19774b = arrayList;
            obj.f19775c = backStackRecordStateArr;
            obj.d = this.f19745i.get();
            Fragment fragment3 = this.x;
            if (fragment3 != null) {
                obj.f19776f = fragment3.mWho;
            }
            arrayList4.addAll(this.f19746j.keySet());
            arrayList5.addAll(this.f19746j.values());
            obj.f19779i = new ArrayList(this.E);
            bundle.putParcelable("state", obj);
            for (String str : this.f19747k.keySet()) {
                bundle.putBundle(androidx.compose.ui.platform.j.b("result_", str), (Bundle) this.f19747k.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(androidx.compose.ui.platform.j.b("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void V() {
        synchronized (this.f19739a) {
            try {
                if (this.f19739a.size() == 1) {
                    this.f19757u.f19733c.removeCallbacks(this.O);
                    this.f19757u.f19733c.post(this.O);
                    c0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void W(Fragment fragment, boolean z2) {
        ViewGroup F = F(fragment);
        if (F == null || !(F instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) F).setDrawDisappearingViewsLast(!z2);
    }

    public final void X(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(this.f19741c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void Y(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f19741c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.x;
        this.x = fragment;
        r(fragment2);
        r(this.x);
    }

    public final void Z(Fragment fragment) {
        ViewGroup F = F(fragment);
        if (F != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (F.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    F.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) F.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final FragmentStateManager a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.d(fragment, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        FragmentStateManager g2 = g(fragment);
        fragment.mFragmentManager = this;
        FragmentStore fragmentStore = this.f19741c;
        fragmentStore.g(g2);
        if (!fragment.mDetached) {
            fragmentStore.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (J(fragment)) {
                this.F = true;
            }
        }
        return g2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, androidx.activity.result.contract.ActivityResultContract] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, androidx.activity.result.contract.ActivityResultContract] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, androidx.activity.result.contract.ActivityResultContract] */
    public final void b(FragmentHostCallback fragmentHostCallback, FragmentContainer fragmentContainer, final Fragment fragment) {
        if (this.f19757u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f19757u = fragmentHostCallback;
        this.f19758v = fragmentContainer;
        this.w = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f19750n;
        if (fragment != null) {
            copyOnWriteArrayList.add(new FragmentOnAttachListener() { // from class: androidx.fragment.app.FragmentManager.7
                @Override // androidx.fragment.app.FragmentOnAttachListener
                public final void a(Fragment fragment2) {
                    Fragment.this.onAttachFragment(fragment2);
                }
            });
        } else if (fragmentHostCallback instanceof FragmentOnAttachListener) {
            copyOnWriteArrayList.add((FragmentOnAttachListener) fragmentHostCallback);
        }
        if (this.w != null) {
            c0();
        }
        if (fragmentHostCallback instanceof OnBackPressedDispatcherOwner) {
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) fragmentHostCallback;
            OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
            this.f19743g = onBackPressedDispatcher;
            LifecycleOwner lifecycleOwner = onBackPressedDispatcherOwner;
            if (fragment != null) {
                lifecycleOwner = fragment;
            }
            onBackPressedDispatcher.a(lifecycleOwner, this.f19744h);
        }
        if (fragment != null) {
            FragmentManagerViewModel fragmentManagerViewModel = fragment.mFragmentManager.N;
            HashMap hashMap = fragmentManagerViewModel.f19782c;
            FragmentManagerViewModel fragmentManagerViewModel2 = (FragmentManagerViewModel) hashMap.get(fragment.mWho);
            if (fragmentManagerViewModel2 == null) {
                fragmentManagerViewModel2 = new FragmentManagerViewModel(fragmentManagerViewModel.e);
                hashMap.put(fragment.mWho, fragmentManagerViewModel2);
            }
            this.N = fragmentManagerViewModel2;
        } else if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            this.N = (FragmentManagerViewModel) new ViewModelProvider(((ViewModelStoreOwner) fragmentHostCallback).getViewModelStore(), FragmentManagerViewModel.f19780h).c(g0.a(FragmentManagerViewModel.class));
        } else {
            this.N = new FragmentManagerViewModel(false);
        }
        FragmentManagerViewModel fragmentManagerViewModel3 = this.N;
        int i2 = 1;
        fragmentManagerViewModel3.f19784g = this.G || this.H;
        this.f19741c.d = fragmentManagerViewModel3;
        Object obj = this.f19757u;
        if ((obj instanceof SavedStateRegistryOwner) && fragment == null) {
            SavedStateRegistry savedStateRegistry = ((SavedStateRegistryOwner) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new e(this, i2));
            Bundle a2 = savedStateRegistry.a("android:support:fragments");
            if (a2 != null) {
                T(a2);
            }
        }
        Object obj2 = this.f19757u;
        if (obj2 instanceof ActivityResultRegistryOwner) {
            ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) obj2).getActivityResultRegistry();
            String b2 = androidx.compose.ui.platform.j.b("FragmentManager:", fragment != null ? android.support.v4.media.d.r(new StringBuilder(), fragment.mWho, CertificateUtil.DELIMITER) : "");
            this.B = activityResultRegistry.d(androidx.compose.foundation.text.input.a.j(b2, "StartActivityForResult"), new Object(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.8
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj3) {
                    ActivityResult activityResult = (ActivityResult) obj3;
                    FragmentManager fragmentManager = FragmentManager.this;
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.E.pollLast();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No Activities were started for result for " + this);
                        return;
                    }
                    FragmentStore fragmentStore = fragmentManager.f19741c;
                    String str = launchedFragmentInfo.f19768a;
                    Fragment c2 = fragmentStore.c(str);
                    if (c2 != null) {
                        c2.onActivityResult(launchedFragmentInfo.f19769b, activityResult.f276a, activityResult.f277b);
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    }
                }
            });
            this.C = activityResultRegistry.d(androidx.compose.foundation.text.input.a.j(b2, "StartIntentSenderForResult"), new Object(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.9
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj3) {
                    ActivityResult activityResult = (ActivityResult) obj3;
                    FragmentManager fragmentManager = FragmentManager.this;
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.E.pollFirst();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No IntentSenders were started for " + this);
                        return;
                    }
                    FragmentStore fragmentStore = fragmentManager.f19741c;
                    String str = launchedFragmentInfo.f19768a;
                    Fragment c2 = fragmentStore.c(str);
                    if (c2 != null) {
                        c2.onActivityResult(launchedFragmentInfo.f19769b, activityResult.f276a, activityResult.f277b);
                    } else {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    }
                }
            });
            this.D = activityResultRegistry.d(androidx.compose.foundation.text.input.a.j(b2, "RequestPermissions"), new Object(), new ActivityResultCallback<Map<String, Boolean>>() { // from class: androidx.fragment.app.FragmentManager.10
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj3) {
                    Map map = (Map) obj3;
                    String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                    ArrayList arrayList = new ArrayList(map.values());
                    int[] iArr = new int[arrayList.size()];
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        iArr[i3] = ((Boolean) arrayList.get(i3)).booleanValue() ? 0 : -1;
                    }
                    FragmentManager fragmentManager = FragmentManager.this;
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.E.pollFirst();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No permissions were requested for " + this);
                        return;
                    }
                    FragmentStore fragmentStore = fragmentManager.f19741c;
                    String str = launchedFragmentInfo.f19768a;
                    Fragment c2 = fragmentStore.c(str);
                    if (c2 != null) {
                        c2.onRequestPermissionsResult(launchedFragmentInfo.f19769b, strArr, iArr);
                        return;
                    }
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                }
            });
        }
        Object obj3 = this.f19757u;
        if (obj3 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj3).addOnConfigurationChangedListener(this.f19751o);
        }
        Object obj4 = this.f19757u;
        if (obj4 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj4).addOnTrimMemoryListener(this.f19752p);
        }
        Object obj5 = this.f19757u;
        if (obj5 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj5).addOnMultiWindowModeChangedListener(this.f19753q);
        }
        Object obj6 = this.f19757u;
        if (obj6 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj6).addOnPictureInPictureModeChangedListener(this.f19754r);
        }
        Object obj7 = this.f19757u;
        if ((obj7 instanceof MenuHost) && fragment == null) {
            ((MenuHost) obj7).addMenuProvider(this.f19755s);
        }
    }

    public final void b0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter());
        FragmentHostCallback fragmentHostCallback = this.f19757u;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.d(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            v("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void c(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f19741c.a(fragment);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (J(fragment)) {
                this.F = true;
            }
        }
    }

    public final void c0() {
        synchronized (this.f19739a) {
            try {
                if (!this.f19739a.isEmpty()) {
                    OnBackPressedCallback onBackPressedCallback = this.f19744h;
                    onBackPressedCallback.f163a = true;
                    q0.a aVar = onBackPressedCallback.f165c;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    return;
                }
                OnBackPressedCallback onBackPressedCallback2 = this.f19744h;
                ArrayList arrayList = this.d;
                onBackPressedCallback2.f163a = arrayList != null && arrayList.size() > 0 && L(this.w);
                q0.a aVar2 = onBackPressedCallback2.f165c;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final FragmentTransaction d() {
        return new BackStackRecord(this);
    }

    public final void e() {
        this.f19740b = false;
        this.L.clear();
        this.K.clear();
    }

    public final HashSet f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f19741c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((FragmentStateManager) it.next()).f19800c.mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.Companion.a(viewGroup, H()));
            }
        }
        return hashSet;
    }

    public final FragmentStateManager g(Fragment fragment) {
        String str = fragment.mWho;
        FragmentStore fragmentStore = this.f19741c;
        FragmentStateManager fragmentStateManager = (FragmentStateManager) fragmentStore.f19804b.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager;
        }
        FragmentStateManager fragmentStateManager2 = new FragmentStateManager(this.f19749m, fragmentStore, fragment);
        fragmentStateManager2.l(this.f19757u.f19732b.getClassLoader());
        fragmentStateManager2.e = this.f19756t;
        return fragmentStateManager2;
    }

    public final void h(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            FragmentStore fragmentStore = this.f19741c;
            synchronized (fragmentStore.f19803a) {
                fragmentStore.f19803a.remove(fragment);
            }
            fragment.mAdded = false;
            if (J(fragment)) {
                this.F = true;
            }
            Z(fragment);
        }
    }

    public final void i(boolean z2, Configuration configuration) {
        if (z2 && (this.f19757u instanceof OnConfigurationChangedProvider)) {
            b0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f19741c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z2) {
                    fragment.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.f19756t < 1) {
            return false;
        }
        for (Fragment fragment : this.f19741c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f19756t < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (Fragment fragment : this.f19741c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = (Fragment) this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r0 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r6 = this;
            r0 = 1
            r6.I = r0
            r6.y(r0)
            java.util.HashSet r1 = r6.f()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2
            r2.i()
            goto Le
        L1e:
            androidx.fragment.app.FragmentHostCallback r1 = r6.f19757u
            boolean r2 = r1 instanceof androidx.lifecycle.ViewModelStoreOwner
            androidx.fragment.app.FragmentStore r3 = r6.f19741c
            if (r2 == 0) goto L2b
            androidx.fragment.app.FragmentManagerViewModel r0 = r3.d
            boolean r0 = r0.f19783f
            goto L38
        L2b:
            android.content.Context r1 = r1.f19732b
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L3a
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r0 = r0 ^ r1
        L38:
            if (r0 == 0) goto L69
        L3a:
            java.util.Map r0 = r6.f19746j
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L44:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.BackStackState r1 = (androidx.fragment.app.BackStackState) r1
            java.util.List r1 = r1.f19668a
            java.util.Iterator r1 = r1.iterator()
        L56:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.fragment.app.FragmentManagerViewModel r4 = r3.d
            r5 = 0
            r4.d(r2, r5)
            goto L56
        L69:
            r0 = -1
            r6.u(r0)
            androidx.fragment.app.FragmentHostCallback r0 = r6.f19757u
            boolean r1 = r0 instanceof androidx.core.content.OnTrimMemoryProvider
            if (r1 == 0) goto L7a
            androidx.core.content.OnTrimMemoryProvider r0 = (androidx.core.content.OnTrimMemoryProvider) r0
            androidx.fragment.app.h r1 = r6.f19752p
            r0.removeOnTrimMemoryListener(r1)
        L7a:
            androidx.fragment.app.FragmentHostCallback r0 = r6.f19757u
            boolean r1 = r0 instanceof androidx.core.content.OnConfigurationChangedProvider
            if (r1 == 0) goto L87
            androidx.core.content.OnConfigurationChangedProvider r0 = (androidx.core.content.OnConfigurationChangedProvider) r0
            androidx.fragment.app.h r1 = r6.f19751o
            r0.removeOnConfigurationChangedListener(r1)
        L87:
            androidx.fragment.app.FragmentHostCallback r0 = r6.f19757u
            boolean r1 = r0 instanceof androidx.core.app.OnMultiWindowModeChangedProvider
            if (r1 == 0) goto L94
            androidx.core.app.OnMultiWindowModeChangedProvider r0 = (androidx.core.app.OnMultiWindowModeChangedProvider) r0
            androidx.fragment.app.h r1 = r6.f19753q
            r0.removeOnMultiWindowModeChangedListener(r1)
        L94:
            androidx.fragment.app.FragmentHostCallback r0 = r6.f19757u
            boolean r1 = r0 instanceof androidx.core.app.OnPictureInPictureModeChangedProvider
            if (r1 == 0) goto La1
            androidx.core.app.OnPictureInPictureModeChangedProvider r0 = (androidx.core.app.OnPictureInPictureModeChangedProvider) r0
            androidx.fragment.app.h r1 = r6.f19754r
            r0.removeOnPictureInPictureModeChangedListener(r1)
        La1:
            androidx.fragment.app.FragmentHostCallback r0 = r6.f19757u
            boolean r1 = r0 instanceof androidx.core.view.MenuHost
            if (r1 == 0) goto Lb2
            androidx.fragment.app.Fragment r1 = r6.w
            if (r1 != 0) goto Lb2
            androidx.core.view.MenuHost r0 = (androidx.core.view.MenuHost) r0
            androidx.core.view.MenuProvider r1 = r6.f19755s
            r0.removeMenuProvider(r1)
        Lb2:
            r0 = 0
            r6.f19757u = r0
            r6.f19758v = r0
            r6.w = r0
            androidx.activity.OnBackPressedDispatcher r1 = r6.f19743g
            if (r1 == 0) goto Lc4
            androidx.activity.OnBackPressedCallback r1 = r6.f19744h
            r1.e()
            r6.f19743g = r0
        Lc4:
            androidx.activity.result.ActivityResultLauncher r0 = r6.B
            if (r0 == 0) goto Ld5
            r0.c()
            androidx.activity.result.ActivityResultLauncher r0 = r6.C
            r0.c()
            androidx.activity.result.ActivityResultLauncher r0 = r6.D
            r0.c()
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.l():void");
    }

    public final void m(boolean z2) {
        if (z2 && (this.f19757u instanceof OnTrimMemoryProvider)) {
            b0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f19741c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z2) {
                    fragment.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z2, boolean z3) {
        if (z3 && (this.f19757u instanceof OnMultiWindowModeChangedProvider)) {
            b0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f19741c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z2);
                if (z3) {
                    fragment.mChildFragmentManager.n(z2, true);
                }
            }
        }
    }

    public final void o() {
        Iterator it = this.f19741c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f19756t < 1) {
            return false;
        }
        for (Fragment fragment : this.f19741c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.f19756t < 1) {
            return;
        }
        for (Fragment fragment : this.f19741c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f19741c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z2, boolean z3) {
        if (z3 && (this.f19757u instanceof OnPictureInPictureModeChangedProvider)) {
            b0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f19741c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z2);
                if (z3) {
                    fragment.mChildFragmentManager.s(z2, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z2 = false;
        if (this.f19756t < 1) {
            return false;
        }
        for (Fragment fragment : this.f19741c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.w;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.w)));
            sb.append("}");
        } else {
            FragmentHostCallback fragmentHostCallback = this.f19757u;
            if (fragmentHostCallback != null) {
                sb.append(fragmentHostCallback.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f19757u)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i2) {
        try {
            this.f19740b = true;
            for (FragmentStateManager fragmentStateManager : this.f19741c.f19804b.values()) {
                if (fragmentStateManager != null) {
                    fragmentStateManager.e = i2;
                }
            }
            M(i2, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).i();
            }
            this.f19740b = false;
            y(true);
        } catch (Throwable th) {
            this.f19740b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String j2 = androidx.compose.foundation.text.input.a.j(str, "    ");
        FragmentStore fragmentStore = this.f19741c;
        fragmentStore.getClass();
        String str2 = str + "    ";
        HashMap hashMap = fragmentStore.f19804b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (FragmentStateManager fragmentStateManager : hashMap.values()) {
                printWriter.print(str);
                if (fragmentStateManager != null) {
                    Fragment fragment = fragmentStateManager.f19800c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = fragmentStore.f19803a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                Fragment fragment2 = (Fragment) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                Fragment fragment3 = (Fragment) this.e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                BackStackRecord backStackRecord = (BackStackRecord) this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(backStackRecord.toString());
                backStackRecord.k(j2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f19745i.get());
        synchronized (this.f19739a) {
            try {
                int size4 = this.f19739a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj = (OpGenerator) this.f19739a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f19757u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f19758v);
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f19756t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    public final void w(OpGenerator opGenerator, boolean z2) {
        if (!z2) {
            if (this.f19757u == null) {
                if (!this.I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.G || this.H) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f19739a) {
            try {
                if (this.f19757u == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f19739a.add(opGenerator);
                    V();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f19740b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f19757u == null) {
            if (!this.I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f19757u.f19733c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.G || this.H)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.K == null) {
            this.K = new ArrayList();
            this.L = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        x(z2);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.K;
            ArrayList arrayList2 = this.L;
            synchronized (this.f19739a) {
                if (this.f19739a.isEmpty()) {
                    break;
                }
                try {
                    int size = this.f19739a.size();
                    boolean z4 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z4 |= ((OpGenerator) this.f19739a.get(i2)).a(arrayList, arrayList2);
                    }
                    if (!z4) {
                        break;
                    }
                    this.f19740b = true;
                    try {
                        S(this.K, this.L);
                        e();
                        z3 = true;
                    } catch (Throwable th) {
                        e();
                        throw th;
                    }
                } finally {
                    this.f19739a.clear();
                    this.f19757u.f19733c.removeCallbacks(this.O);
                }
            }
        }
        c0();
        if (this.J) {
            this.J = false;
            Iterator it = this.f19741c.d().iterator();
            while (it.hasNext()) {
                FragmentStateManager fragmentStateManager = (FragmentStateManager) it.next();
                Fragment fragment = fragmentStateManager.f19800c;
                if (fragment.mDeferStart) {
                    if (this.f19740b) {
                        this.J = true;
                    } else {
                        fragment.mDeferStart = false;
                        fragmentStateManager.k();
                    }
                }
            }
        }
        this.f19741c.f19804b.values().removeAll(Collections.singleton(null));
        return z3;
    }

    public final void z(OpGenerator opGenerator, boolean z2) {
        if (z2 && (this.f19757u == null || this.I)) {
            return;
        }
        x(z2);
        if (opGenerator.a(this.K, this.L)) {
            this.f19740b = true;
            try {
                S(this.K, this.L);
            } finally {
                e();
            }
        }
        c0();
        boolean z3 = this.J;
        FragmentStore fragmentStore = this.f19741c;
        if (z3) {
            this.J = false;
            Iterator it = fragmentStore.d().iterator();
            while (it.hasNext()) {
                FragmentStateManager fragmentStateManager = (FragmentStateManager) it.next();
                Fragment fragment = fragmentStateManager.f19800c;
                if (fragment.mDeferStart) {
                    if (this.f19740b) {
                        this.J = true;
                    } else {
                        fragment.mDeferStart = false;
                        fragmentStateManager.k();
                    }
                }
            }
        }
        fragmentStore.f19804b.values().removeAll(Collections.singleton(null));
    }
}

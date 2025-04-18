package androidx.viewpager2.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.RequiresOptIn;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<FragmentViewHolder> implements StatefulAdapter {

    /* renamed from: i, reason: collision with root package name */
    public FragmentMaxLifecycleEnforcer f21785i;

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 implements LifecycleEventObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            throw null;
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass2 extends FragmentManager.FragmentLifecycleCallbacks {
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass4 implements LifecycleEventObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                throw null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i2, int i3, int i4) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i2, int i3, Object obj) {
            onChanged();
        }
    }

    @RequiresOptIn
    /* loaded from: classes.dex */
    public @interface ExperimentalFragmentStateAdapterApi {
    }

    /* loaded from: classes.dex */
    public static class FragmentEventDispatcher {
    }

    /* loaded from: classes.dex */
    public class FragmentMaxLifecycleEnforcer {

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        class AnonymousClass1 extends ViewPager2.OnPageChangeCallback {
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        class AnonymousClass2 extends DataSetChangeObserver {
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void onChanged() {
                throw null;
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        class AnonymousClass3 implements LifecycleEventObserver {
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                throw null;
            }
        }

        public FragmentMaxLifecycleEnforcer(FragmentStateAdapter fragmentStateAdapter) {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class FragmentTransactionCallback {

        /* renamed from: a, reason: collision with root package name */
        public static final OnPostEventListener f21786a = new Object();

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements OnPostEventListener {
        }

        /* loaded from: classes.dex */
        public interface OnPostEventListener {
        }
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void a() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (this.f21785i != null) {
            throw new IllegalArgumentException();
        }
        this.f21785i = new FragmentMaxLifecycleEnforcer(this);
        FragmentMaxLifecycleEnforcer.a(recyclerView).getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        FragmentViewHolder fragmentViewHolder = (FragmentViewHolder) viewHolder;
        fragmentViewHolder.getItemId();
        ((FrameLayout) fragmentViewHolder.itemView).getId();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3 = FragmentViewHolder.f21787b;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new RecyclerView.ViewHolder(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f21785i.getClass();
        FragmentMaxLifecycleEnforcer.a(recyclerView).getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(FragmentViewHolder fragmentViewHolder) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(FragmentViewHolder fragmentViewHolder) {
        fragmentViewHolder.getItemId();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(FragmentViewHolder fragmentViewHolder) {
        ((FrameLayout) fragmentViewHolder.itemView).getId();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z2) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}

package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ListFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f19849a = new Handler();

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f19850b = new Runnable() { // from class: androidx.fragment.app.ListFragment.1
        @Override // java.lang.Runnable
        public final void run() {
            ListView listView = ListFragment.this.f19852f;
            listView.focusableViewAvailable(listView);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f19851c = new AdapterView.OnItemClickListener() { // from class: androidx.fragment.app.ListFragment.2
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
            ListFragment.this.getClass();
        }
    };
    public ListAdapter d;

    /* renamed from: f, reason: collision with root package name */
    public ListView f19852f;

    /* renamed from: g, reason: collision with root package name */
    public View f19853g;

    /* renamed from: h, reason: collision with root package name */
    public View f19854h;

    /* renamed from: i, reason: collision with root package name */
    public View f19855i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19856j;

    public final void g() {
        if (this.f19852f != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f19852f = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            if (textView == null) {
                this.f19853g = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f19854h = view.findViewById(16711682);
            this.f19855i = view.findViewById(16711683);
            View findViewById = view.findViewById(R.id.list);
            if (!(findViewById instanceof ListView)) {
                if (findViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) findViewById;
            this.f19852f = listView;
            View view2 = this.f19853g;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.f19856j = true;
        this.f19852f.setOnItemClickListener(this.f19851c);
        ListAdapter listAdapter = this.d;
        if (listAdapter != null) {
            this.d = listAdapter;
            ListView listView2 = this.f19852f;
            if (listView2 != null) {
                listView2.setAdapter(listAdapter);
                if (!this.f19856j) {
                    h(true, requireView().getWindowToken() != null);
                }
            }
        } else if (this.f19854h != null) {
            h(false, false);
        }
        this.f19849a.post(this.f19850b);
    }

    public final void h(boolean z2, boolean z3) {
        g();
        View view = this.f19854h;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f19856j == z2) {
            return;
        }
        this.f19856j = z2;
        if (z2) {
            if (z3) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.f19855i.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
            } else {
                view.clearAnimation();
                this.f19855i.clearAnimation();
            }
            this.f19854h.setVisibility(8);
            this.f19855i.setVisibility(0);
            return;
        }
        if (z3) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
            this.f19855i.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f19855i.clearAnimation();
        }
        this.f19854h.setVisibility(0);
        this.f19855i.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f19849a.removeCallbacks(this.f19850b);
        this.f19852f = null;
        this.f19856j = false;
        this.f19855i = null;
        this.f19854h = null;
        this.f19853g = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        g();
    }
}

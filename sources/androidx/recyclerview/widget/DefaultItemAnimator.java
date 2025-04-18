package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.media.d;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DefaultItemAnimator extends SimpleItemAnimator {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f20932s;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f20933h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f20934i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f20935j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f20936k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f20937l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f20938m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f20939n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f20940o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f20941p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f20942q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f20943r;

    /* loaded from: classes.dex */
    public static class ChangeInfo {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.ViewHolder f20966a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.ViewHolder f20967b;

        /* renamed from: c, reason: collision with root package name */
        public int f20968c;
        public int d;
        public int e;

        /* renamed from: f, reason: collision with root package name */
        public int f20969f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f20966a);
            sb.append(", newHolder=");
            sb.append(this.f20967b);
            sb.append(", fromX=");
            sb.append(this.f20968c);
            sb.append(", fromY=");
            sb.append(this.d);
            sb.append(", toX=");
            sb.append(this.e);
            sb.append(", toY=");
            return d.o(sb, this.f20969f, '}');
        }
    }

    /* loaded from: classes.dex */
    public static class MoveInfo {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.ViewHolder f20970a;

        /* renamed from: b, reason: collision with root package name */
        public int f20971b;

        /* renamed from: c, reason: collision with root package name */
        public int f20972c;
        public int d;
        public int e;
    }

    public static void q(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.ViewHolder) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean g(RecyclerView.ViewHolder viewHolder, List list) {
        return !list.isEmpty() || f(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void i(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.f20935j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((MoveInfo) arrayList.get(size)).f20970a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                h(viewHolder);
                arrayList.remove(size);
            }
        }
        s(viewHolder, this.f20936k);
        if (this.f20933h.remove(viewHolder)) {
            view.setAlpha(1.0f);
            h(viewHolder);
        }
        if (this.f20934i.remove(viewHolder)) {
            view.setAlpha(1.0f);
            h(viewHolder);
        }
        ArrayList arrayList2 = this.f20939n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            s(viewHolder, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f20938m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((MoveInfo) arrayList5.get(size4)).f20970a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    h(viewHolder);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f20937l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(viewHolder)) {
                view.setAlpha(1.0f);
                h(viewHolder);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f20942q.remove(viewHolder);
        this.f20940o.remove(viewHolder);
        this.f20943r.remove(viewHolder);
        this.f20941p.remove(viewHolder);
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void j() {
        ArrayList arrayList = this.f20935j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            MoveInfo moveInfo = (MoveInfo) arrayList.get(size);
            View view = moveInfo.f20970a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            h(moveInfo.f20970a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f20933h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            h((RecyclerView.ViewHolder) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f20934i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) arrayList3.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            h(viewHolder);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f20936k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ChangeInfo changeInfo = (ChangeInfo) arrayList4.get(size4);
            RecyclerView.ViewHolder viewHolder2 = changeInfo.f20966a;
            if (viewHolder2 != null) {
                t(changeInfo, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = changeInfo.f20967b;
            if (viewHolder3 != null) {
                t(changeInfo, viewHolder3);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.f20938m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    MoveInfo moveInfo2 = (MoveInfo) arrayList6.get(size6);
                    View view2 = moveInfo2.f20970a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    h(moveInfo2.f20970a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f20937l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) arrayList8.get(size8);
                    viewHolder4.itemView.setAlpha(1.0f);
                    h(viewHolder4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f20939n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    ChangeInfo changeInfo2 = (ChangeInfo) arrayList10.get(size10);
                    RecyclerView.ViewHolder viewHolder5 = changeInfo2.f20966a;
                    if (viewHolder5 != null) {
                        t(changeInfo2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = changeInfo2.f20967b;
                    if (viewHolder6 != null) {
                        t(changeInfo2, viewHolder6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            q(this.f20942q);
            q(this.f20941p);
            q(this.f20940o);
            q(this.f20943r);
            ArrayList arrayList11 = this.f21067b;
            int size11 = arrayList11.size();
            for (int i2 = 0; i2 < size11; i2++) {
                ((RecyclerView.ItemAnimator.ItemAnimatorFinishedListener) arrayList11.get(i2)).a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean k() {
        return (this.f20934i.isEmpty() && this.f20936k.isEmpty() && this.f20935j.isEmpty() && this.f20933h.isEmpty() && this.f20941p.isEmpty() && this.f20942q.isEmpty() && this.f20940o.isEmpty() && this.f20943r.isEmpty() && this.f20938m.isEmpty() && this.f20937l.isEmpty() && this.f20939n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void l() {
        long j2;
        ArrayList arrayList = this.f20933h;
        boolean z2 = !arrayList.isEmpty();
        ArrayList arrayList2 = this.f20935j;
        boolean z3 = !arrayList2.isEmpty();
        ArrayList arrayList3 = this.f20936k;
        boolean z4 = !arrayList3.isEmpty();
        ArrayList arrayList4 = this.f20934i;
        boolean z5 = !arrayList4.isEmpty();
        if (z2 || z3 || z5 || z4) {
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                j2 = this.d;
                if (!hasNext) {
                    break;
                }
                final RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) it.next();
                final View view = viewHolder.itemView;
                final ViewPropertyAnimator animate = view.animate();
                this.f20942q.add(viewHolder);
                animate.setDuration(j2).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        animate.setListener(null);
                        view.setAlpha(1.0f);
                        DefaultItemAnimator defaultItemAnimator = this;
                        RecyclerView.ViewHolder viewHolder2 = viewHolder;
                        defaultItemAnimator.h(viewHolder2);
                        defaultItemAnimator.f20942q.remove(viewHolder2);
                        defaultItemAnimator.r();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        this.getClass();
                    }
                }).start();
            }
            arrayList.clear();
            if (z3) {
                final ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.f20938m.add(arrayList5);
                arrayList2.clear();
                Runnable runnable = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList arrayList6 = arrayList5;
                        Iterator it2 = arrayList6.iterator();
                        while (true) {
                            boolean hasNext2 = it2.hasNext();
                            final DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                            if (!hasNext2) {
                                arrayList6.clear();
                                defaultItemAnimator.f20938m.remove(arrayList6);
                                return;
                            }
                            MoveInfo moveInfo = (MoveInfo) it2.next();
                            final RecyclerView.ViewHolder viewHolder2 = moveInfo.f20970a;
                            defaultItemAnimator.getClass();
                            final View view2 = viewHolder2.itemView;
                            final int i2 = moveInfo.d - moveInfo.f20971b;
                            final int i3 = moveInfo.e - moveInfo.f20972c;
                            if (i2 != 0) {
                                view2.animate().translationX(0.0f);
                            }
                            if (i3 != 0) {
                                view2.animate().translationY(0.0f);
                            }
                            final ViewPropertyAnimator animate2 = view2.animate();
                            defaultItemAnimator.f20941p.add(viewHolder2);
                            animate2.setDuration(defaultItemAnimator.e).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.6
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animator) {
                                    int i4 = i2;
                                    View view3 = view2;
                                    if (i4 != 0) {
                                        view3.setTranslationX(0.0f);
                                    }
                                    if (i3 != 0) {
                                        view3.setTranslationY(0.0f);
                                    }
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    animate2.setListener(null);
                                    DefaultItemAnimator defaultItemAnimator2 = DefaultItemAnimator.this;
                                    RecyclerView.ViewHolder viewHolder3 = viewHolder2;
                                    defaultItemAnimator2.h(viewHolder3);
                                    defaultItemAnimator2.f20941p.remove(viewHolder3);
                                    defaultItemAnimator2.r();
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    DefaultItemAnimator.this.getClass();
                                }
                            }).start();
                        }
                    }
                };
                if (z2) {
                    View view2 = ((MoveInfo) arrayList5.get(0)).f20970a.itemView;
                    WeakHashMap weakHashMap = ViewCompat.f18740a;
                    view2.postOnAnimationDelayed(runnable, j2);
                } else {
                    runnable.run();
                }
            }
            if (z4) {
                final ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.f20939n.add(arrayList6);
                arrayList3.clear();
                Runnable runnable2 = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList arrayList7 = arrayList6;
                        Iterator it2 = arrayList7.iterator();
                        while (true) {
                            boolean hasNext2 = it2.hasNext();
                            final DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                            if (!hasNext2) {
                                arrayList7.clear();
                                defaultItemAnimator.f20939n.remove(arrayList7);
                                return;
                            }
                            final ChangeInfo changeInfo = (ChangeInfo) it2.next();
                            defaultItemAnimator.getClass();
                            RecyclerView.ViewHolder viewHolder2 = changeInfo.f20966a;
                            final View view3 = viewHolder2 == null ? null : viewHolder2.itemView;
                            RecyclerView.ViewHolder viewHolder3 = changeInfo.f20967b;
                            final View view4 = viewHolder3 != null ? viewHolder3.itemView : null;
                            ArrayList arrayList8 = defaultItemAnimator.f20943r;
                            long j3 = defaultItemAnimator.f21069f;
                            if (view3 != null) {
                                final ViewPropertyAnimator duration = view3.animate().setDuration(j3);
                                arrayList8.add(changeInfo.f20966a);
                                duration.translationX(changeInfo.e - changeInfo.f20968c);
                                duration.translationY(changeInfo.f20969f - changeInfo.d);
                                duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.7
                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator) {
                                        duration.setListener(null);
                                        View view5 = view3;
                                        view5.setAlpha(1.0f);
                                        view5.setTranslationX(0.0f);
                                        view5.setTranslationY(0.0f);
                                        ChangeInfo changeInfo2 = changeInfo;
                                        RecyclerView.ViewHolder viewHolder4 = changeInfo2.f20966a;
                                        DefaultItemAnimator defaultItemAnimator2 = DefaultItemAnimator.this;
                                        defaultItemAnimator2.h(viewHolder4);
                                        defaultItemAnimator2.f20943r.remove(changeInfo2.f20966a);
                                        defaultItemAnimator2.r();
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationStart(Animator animator) {
                                        RecyclerView.ViewHolder viewHolder4 = changeInfo.f20966a;
                                        DefaultItemAnimator.this.getClass();
                                    }
                                }).start();
                            }
                            if (view4 != null) {
                                final ViewPropertyAnimator animate2 = view4.animate();
                                arrayList8.add(changeInfo.f20967b);
                                animate2.translationX(0.0f).translationY(0.0f).setDuration(j3).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.8
                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator) {
                                        animate2.setListener(null);
                                        View view5 = view4;
                                        view5.setAlpha(1.0f);
                                        view5.setTranslationX(0.0f);
                                        view5.setTranslationY(0.0f);
                                        ChangeInfo changeInfo2 = changeInfo;
                                        RecyclerView.ViewHolder viewHolder4 = changeInfo2.f20967b;
                                        DefaultItemAnimator defaultItemAnimator2 = DefaultItemAnimator.this;
                                        defaultItemAnimator2.h(viewHolder4);
                                        defaultItemAnimator2.f20943r.remove(changeInfo2.f20967b);
                                        defaultItemAnimator2.r();
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationStart(Animator animator) {
                                        RecyclerView.ViewHolder viewHolder4 = changeInfo.f20967b;
                                        DefaultItemAnimator.this.getClass();
                                    }
                                }).start();
                            }
                        }
                    }
                };
                if (z2) {
                    View view3 = ((ChangeInfo) arrayList6.get(0)).f20966a.itemView;
                    WeakHashMap weakHashMap2 = ViewCompat.f18740a;
                    view3.postOnAnimationDelayed(runnable2, j2);
                } else {
                    runnable2.run();
                }
            }
            if (z5) {
                final ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.f20937l.add(arrayList7);
                arrayList4.clear();
                Runnable runnable3 = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList arrayList8 = arrayList7;
                        Iterator it2 = arrayList8.iterator();
                        while (true) {
                            boolean hasNext2 = it2.hasNext();
                            final DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                            if (!hasNext2) {
                                arrayList8.clear();
                                defaultItemAnimator.f20937l.remove(arrayList8);
                                return;
                            }
                            final RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) it2.next();
                            defaultItemAnimator.getClass();
                            final View view4 = viewHolder2.itemView;
                            final ViewPropertyAnimator animate2 = view4.animate();
                            defaultItemAnimator.f20940o.add(viewHolder2);
                            animate2.alpha(1.0f).setDuration(defaultItemAnimator.f21068c).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.5
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animator) {
                                    view4.setAlpha(1.0f);
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    animate2.setListener(null);
                                    DefaultItemAnimator defaultItemAnimator2 = defaultItemAnimator;
                                    RecyclerView.ViewHolder viewHolder3 = viewHolder2;
                                    defaultItemAnimator2.h(viewHolder3);
                                    defaultItemAnimator2.f20940o.remove(viewHolder3);
                                    defaultItemAnimator2.r();
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    defaultItemAnimator.getClass();
                                }
                            }).start();
                        }
                    }
                };
                if (!z2 && !z3 && !z4) {
                    runnable3.run();
                    return;
                }
                if (!z2) {
                    j2 = 0;
                }
                long max = Math.max(z3 ? this.e : 0L, z4 ? this.f21069f : 0L) + j2;
                View view4 = ((RecyclerView.ViewHolder) arrayList7.get(0)).itemView;
                WeakHashMap weakHashMap3 = ViewCompat.f18740a;
                view4.postOnAnimationDelayed(runnable3, max);
            }
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void m(RecyclerView.ViewHolder viewHolder) {
        u(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.f20934i.add(viewHolder);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo] */
    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean n(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
        if (viewHolder == viewHolder2) {
            return o(viewHolder, i2, i3, i4, i5);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        u(viewHolder);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            u(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i6);
            viewHolder2.itemView.setTranslationY(-i7);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f20936k;
        ?? obj = new Object();
        obj.f20966a = viewHolder;
        obj.f20967b = viewHolder2;
        obj.f20968c = i2;
        obj.d = i3;
        obj.e = i4;
        obj.f20969f = i5;
        arrayList.add(obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo] */
    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean o(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        View view = viewHolder.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) viewHolder.itemView.getTranslationY());
        u(viewHolder);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            h(viewHolder);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        ArrayList arrayList = this.f20935j;
        ?? obj = new Object();
        obj.f20970a = viewHolder;
        obj.f20971b = translationX;
        obj.f20972c = translationY;
        obj.d = i4;
        obj.e = i5;
        arrayList.add(obj);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void p(RecyclerView.ViewHolder viewHolder) {
        u(viewHolder);
        this.f20933h.add(viewHolder);
    }

    public final void r() {
        if (k()) {
            return;
        }
        ArrayList arrayList = this.f21067b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((RecyclerView.ItemAnimator.ItemAnimatorFinishedListener) arrayList.get(i2)).a();
        }
        arrayList.clear();
    }

    public final void s(RecyclerView.ViewHolder viewHolder, ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ChangeInfo changeInfo = (ChangeInfo) arrayList.get(size);
            if (t(changeInfo, viewHolder) && changeInfo.f20966a == null && changeInfo.f20967b == null) {
                arrayList.remove(changeInfo);
            }
        }
    }

    public final boolean t(ChangeInfo changeInfo, RecyclerView.ViewHolder viewHolder) {
        if (changeInfo.f20967b == viewHolder) {
            changeInfo.f20967b = null;
        } else {
            if (changeInfo.f20966a != viewHolder) {
                return false;
            }
            changeInfo.f20966a = null;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        h(viewHolder);
        return true;
    }

    public final void u(RecyclerView.ViewHolder viewHolder) {
        if (f20932s == null) {
            f20932s = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(f20932s);
        i(viewHolder);
    }
}

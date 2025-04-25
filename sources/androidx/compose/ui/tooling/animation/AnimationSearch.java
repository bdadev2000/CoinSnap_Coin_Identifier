package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.tooling.PreviewUtils_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.data.CallGroup;
import androidx.compose.ui.tooling.data.Group;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;

/* compiled from: AnimationSearch.android.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\f\u001e\u001f !\"#$%&'()B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0014\u0010\u0016\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\rH\u0002J\u0014\u0010\u001b\u001a\u00020\u001c2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014J\u0016\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\rH\u0002J\u0016\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u0014H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch;", "", "clock", "Lkotlin/Function0;", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "onSeek", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "animatedContentSearch", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "animatedVisibilitySearch", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "setToSearch", "", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "setToTrack", "supportedSearch", "transitionSearch", "Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "animateXAsStateSearch", "", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch;", "attachAllAnimations", "slotTrees", "Landroidx/compose/ui/tooling/data/Group;", "infiniteTransitionSearch", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch;", "searchAny", "", "unsupportedSearch", "AnimateContentSizeSearch", "AnimateXAsStateSearch", "AnimateXAsStateSearchInfo", "AnimatedContentSearch", "AnimatedVisibilitySearch", "DecaySearch", "InfiniteTransitionSearch", "InfiniteTransitionSearchInfo", "RememberSearch", "Search", "TargetBasedSearch", "TransitionSearch", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class AnimationSearch {
    public static final int $stable = 8;
    private final AnimatedContentSearch animatedContentSearch;
    private final AnimatedVisibilitySearch animatedVisibilitySearch;
    private final Function0<PreviewAnimationClock> clock;
    private final Function0<Unit> onSeek;
    private final Set<Search<? extends Object>> setToSearch;
    private final Set<Search<? extends Object>> setToTrack;
    private final Set<Search<? extends Object>> supportedSearch;
    private final TransitionSearch transitionSearch = new TransitionSearch(new Function1<Transition<?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$transitionSearch$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Transition<?> transition) {
            invoke2(transition);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Transition<?> transition) {
            Function0 function0;
            function0 = AnimationSearch.this.clock;
            ((PreviewAnimationClock) function0.invoke()).trackTransition(transition);
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public AnimationSearch(Function0<? extends PreviewAnimationClock> function0, Function0<Unit> function02) {
        this.clock = function0;
        this.onSeek = function02;
        AnimatedContentSearch animatedContentSearch = new AnimatedContentSearch(new Function1<Transition<?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$animatedContentSearch$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Transition<?> transition) {
                invoke2(transition);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Transition<?> transition) {
                Function0 function03;
                function03 = AnimationSearch.this.clock;
                ((PreviewAnimationClock) function03.invoke()).trackAnimatedContent(transition);
            }
        });
        this.animatedContentSearch = animatedContentSearch;
        this.animatedVisibilitySearch = new AnimatedVisibilitySearch(new Function1<Transition<?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$animatedVisibilitySearch$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Transition<?> transition) {
                invoke2(transition);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Transition<?> transition) {
                Function0 function03;
                Function0<Unit> function04;
                function03 = AnimationSearch.this.clock;
                PreviewAnimationClock previewAnimationClock = (PreviewAnimationClock) function03.invoke();
                function04 = AnimationSearch.this.onSeek;
                previewAnimationClock.trackAnimatedVisibility(transition, function04);
            }
        });
        Set<Search<? extends Object>> supportedSearch = supportedSearch();
        this.supportedSearch = supportedSearch;
        Set<Search<? extends Object>> plus = SetsKt.plus((Set) supportedSearch, (Iterable) unsupportedSearch());
        this.setToTrack = plus;
        this.setToSearch = SetsKt.plus((Set) plus, (Iterable) SetsKt.setOf(animatedContentSearch));
    }

    private final Collection<AnimateXAsStateSearch> animateXAsStateSearch() {
        if (AnimateXAsStateComposeAnimation.INSTANCE.getApiAvailable()) {
            return SetsKt.setOf(new AnimateXAsStateSearch(new Function1<AnimateXAsStateSearchInfo<?, ?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$animateXAsStateSearch$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationSearch.AnimateXAsStateSearchInfo<?, ?> animateXAsStateSearchInfo) {
                    invoke2(animateXAsStateSearchInfo);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationSearch.AnimateXAsStateSearchInfo<?, ?> animateXAsStateSearchInfo) {
                    Function0 function0;
                    function0 = AnimationSearch.this.clock;
                    ((PreviewAnimationClock) function0.invoke()).trackAnimateXAsState(animateXAsStateSearchInfo);
                }
            }));
        }
        return CollectionsKt.emptyList();
    }

    private final Set<InfiniteTransitionSearch> infiniteTransitionSearch() {
        if (InfiniteTransitionComposeAnimation.INSTANCE.getApiAvailable()) {
            return SetsKt.setOf(new InfiniteTransitionSearch(new Function1<InfiniteTransitionSearchInfo, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$infiniteTransitionSearch$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
                    invoke2(infiniteTransitionSearchInfo);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
                    Function0 function0;
                    function0 = AnimationSearch.this.clock;
                    ((PreviewAnimationClock) function0.invoke()).trackInfiniteTransition(infiniteTransitionSearchInfo);
                }
            }));
        }
        return SetsKt.emptySet();
    }

    private final Set<Search<? extends Object>> supportedSearch() {
        return SetsKt.plus(SetsKt.plus(SetsKt.plus(SetsKt.setOf((Object[]) new Search[]{this.transitionSearch, this.animatedVisibilitySearch}), (Iterable) animateXAsStateSearch()), (Iterable) infiniteTransitionSearch()), (Iterable) (AnimatedContentComposeAnimation.INSTANCE.getApiAvailable() ? SetsKt.setOf(this.animatedContentSearch) : SetsKt.emptySet()));
    }

    private final Collection<Search<? extends Object>> unsupportedSearch() {
        return UnsupportedComposeAnimation.INSTANCE.getApiAvailable() ? SetsKt.setOf((Object[]) new Search[]{new AnimateContentSizeSearch(new Function1<Object, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$unsupportedSearch$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                Function0 function0;
                function0 = AnimationSearch.this.clock;
                ((PreviewAnimationClock) function0.invoke()).trackAnimateContentSize(obj);
            }
        }), new TargetBasedSearch(new Function1<TargetBasedAnimation<?, ?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$unsupportedSearch$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TargetBasedAnimation<?, ?> targetBasedAnimation) {
                invoke2(targetBasedAnimation);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TargetBasedAnimation<?, ?> targetBasedAnimation) {
                Function0 function0;
                function0 = AnimationSearch.this.clock;
                ((PreviewAnimationClock) function0.invoke()).trackTargetBasedAnimations(targetBasedAnimation);
            }
        }), new DecaySearch(new Function1<DecayAnimation<?, ?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$unsupportedSearch$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DecayAnimation<?, ?> decayAnimation) {
                invoke2(decayAnimation);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DecayAnimation<?, ?> decayAnimation) {
                Function0 function0;
                function0 = AnimationSearch.this.clock;
                ((PreviewAnimationClock) function0.invoke()).trackDecayAnimations(decayAnimation);
            }
        })}) : CollectionsKt.emptyList();
    }

    public final boolean searchAny(Collection<? extends Group> slotTrees) {
        Collection<? extends Group> collection = slotTrees;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            List<Group> findAll = PreviewUtils_androidKt.findAll((Group) it.next(), new Function1<Group, Boolean>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$searchAny$1$groups$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Group group) {
                    return true;
                }
            });
            Set<Search<? extends Object>> set = this.supportedSearch;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (((Search) it2.next()).hasAnimations(findAll)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void attachAllAnimations(Collection<? extends Group> slotTrees) {
        Iterator<T> it = slotTrees.iterator();
        while (it.hasNext()) {
            List<Group> findAll = PreviewUtils_androidKt.findAll((Group) it.next(), new Function1<Group, Boolean>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$attachAllAnimations$1$groups$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Group group) {
                    return true;
                }
            });
            Iterator<T> it2 = this.setToSearch.iterator();
            while (it2.hasNext()) {
                ((Search) it2.next()).addAnimations(findAll);
            }
            this.transitionSearch.getAnimations().removeAll(this.animatedVisibilitySearch.getAnimations());
            this.transitionSearch.getAnimations().removeAll(this.animatedContentSearch.getAnimations());
        }
        Iterator<T> it3 = this.setToTrack.iterator();
        while (it3.hasNext()) {
            ((Search) it3.next()).track();
        }
    }

    /* compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH&J\u0014\u0010\u0012\u001a\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0013\u001a\u00020\u0005R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", ExifInterface.GPS_DIRECTION_TRUE, "", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "animations", "", "getAnimations", "()Ljava/util/Set;", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "hasAnimation", "", "group", "hasAnimations", "track", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static abstract class Search<T> {
        public static final int $stable = 8;
        private final Set<T> animations = new LinkedHashSet();
        private final Function1<T, Unit> trackAnimation;

        public void addAnimations(Collection<? extends Group> groups) {
        }

        public abstract boolean hasAnimation(Group group);

        /* JADX WARN: Multi-variable type inference failed */
        public Search(Function1<? super T, Unit> function1) {
            this.trackAnimation = function1;
        }

        public final boolean hasAnimations(Collection<? extends Group> groups) {
            Collection<? extends Group> collection = groups;
            if ((collection instanceof Collection) && collection.isEmpty()) {
                return false;
            }
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (hasAnimation((Group) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final Set<T> getAnimations() {
            return this.animations;
        }

        public final void track() {
            List reversed = CollectionsKt.reversed(this.animations);
            Function1<T, Unit> function1 = this.trackAnimation;
            Iterator<T> it = reversed.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
        }
    }

    /* compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J+\u0010\u0011\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u0002*\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0002¢\u0006\u0002\u0010\u0012J0\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0013\"\b\b\u0001\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "clazz", "Lkotlin/reflect/KClass;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "hasAnimation", "", "group", "findRememberCallWithType", "(Landroidx/compose/ui/tooling/data/Group;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static class RememberSearch<T> extends Search<T> {
        public static final int $stable = 8;
        private final KClass<T> clazz;

        public RememberSearch(KClass<T> kClass, Function1<? super T, Unit> function1) {
            super(function1);
            this.clazz = kClass;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> groups) {
            ArrayList arrayList = new ArrayList();
            for (T t : groups) {
                if (((Group) t).getLocation() != null) {
                    arrayList.add(t);
                }
            }
            getAnimations().addAll(CollectionsKt.toSet(findRememberCallWithType(arrayList, this.clazz)));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            return (group.getLocation() == null || findRememberCallWithType(group, this.clazz) == null) ? false : true;
        }

        private final <T> List<T> findRememberCallWithType(Collection<? extends Group> collection, KClass<T> kClass) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                T findRememberCallWithType = findRememberCallWithType((Group) it.next(), kClass);
                if (findRememberCallWithType != null) {
                    arrayList.add(findRememberCallWithType);
                }
            }
            return arrayList;
        }

        private final <T> T findRememberCallWithType(Group group, KClass<T> kClass) {
            Object obj;
            Class<?> cls;
            Iterator<T> it = group.getData().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next != null && (cls = next.getClass()) != null) {
                    obj = JvmClassMappingKt.getKotlinClass(cls);
                }
                if (Intrinsics.areEqual(obj, kClass)) {
                    obj = next;
                    break;
                }
            }
            return (T) KClasses.safeCast(kClass, obj);
        }
    }

    /* compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B!\u0012\u001a\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$TargetBasedSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "Landroidx/compose/animation/core/TargetBasedAnimation;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class TargetBasedSearch extends RememberSearch<TargetBasedAnimation<?, ?>> {
        public static final int $stable = 0;

        public TargetBasedSearch(Function1<? super TargetBasedAnimation<?, ?>, Unit> function1) {
            super(Reflection.getOrCreateKotlinClass(TargetBasedAnimation.class), function1);
        }
    }

    /* compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B!\u0012\u001a\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$DecaySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "Landroidx/compose/animation/core/DecayAnimation;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class DecaySearch extends RememberSearch<DecayAnimation<?, ?>> {
        public static final int $stable = 0;

        public DecaySearch(Function1<? super DecayAnimation<?, ?>, Unit> function1) {
            super(Reflection.getOrCreateKotlinClass(DecayAnimation.class), function1);
        }
    }

    /* compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "", "infiniteTransition", "Landroidx/compose/animation/core/InfiniteTransition;", "toolingState", "Landroidx/compose/ui/tooling/animation/ToolingState;", "", "(Landroidx/compose/animation/core/InfiniteTransition;Landroidx/compose/ui/tooling/animation/ToolingState;)V", "getInfiniteTransition", "()Landroidx/compose/animation/core/InfiniteTransition;", "getToolingState", "()Landroidx/compose/ui/tooling/animation/ToolingState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final /* data */ class InfiniteTransitionSearchInfo {
        public static final int $stable = InfiniteTransition.$stable;
        private final InfiniteTransition infiniteTransition;
        private final ToolingState<Long> toolingState;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InfiniteTransitionSearchInfo copy$default(InfiniteTransitionSearchInfo infiniteTransitionSearchInfo, InfiniteTransition infiniteTransition, ToolingState toolingState, int i, Object obj) {
            if ((i & 1) != 0) {
                infiniteTransition = infiniteTransitionSearchInfo.infiniteTransition;
            }
            if ((i & 2) != 0) {
                toolingState = infiniteTransitionSearchInfo.toolingState;
            }
            return infiniteTransitionSearchInfo.copy(infiniteTransition, toolingState);
        }

        /* renamed from: component1, reason: from getter */
        public final InfiniteTransition getInfiniteTransition() {
            return this.infiniteTransition;
        }

        public final ToolingState<Long> component2() {
            return this.toolingState;
        }

        public final InfiniteTransitionSearchInfo copy(InfiniteTransition infiniteTransition, ToolingState<Long> toolingState) {
            return new InfiniteTransitionSearchInfo(infiniteTransition, toolingState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfiniteTransitionSearchInfo)) {
                return false;
            }
            InfiniteTransitionSearchInfo infiniteTransitionSearchInfo = (InfiniteTransitionSearchInfo) other;
            return Intrinsics.areEqual(this.infiniteTransition, infiniteTransitionSearchInfo.infiniteTransition) && Intrinsics.areEqual(this.toolingState, infiniteTransitionSearchInfo.toolingState);
        }

        public int hashCode() {
            return (this.infiniteTransition.hashCode() * 31) + this.toolingState.hashCode();
        }

        public String toString() {
            return "InfiniteTransitionSearchInfo(infiniteTransition=" + this.infiniteTransition + ", toolingState=" + this.toolingState + ')';
        }

        public InfiniteTransitionSearchInfo(InfiniteTransition infiniteTransition, ToolingState<Long> toolingState) {
            this.infiniteTransition = infiniteTransition;
            this.toolingState = toolingState;
        }

        public final InfiniteTransition getInfiniteTransition() {
            return this.infiniteTransition;
        }

        public final ToolingState<Long> getToolingState() {
            return this.toolingState;
        }
    }

    /* compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J \u0010\r\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\nH\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "findAnimations", "", "findToolingOverride", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/State;", "", "group", "hasAnimation", "", "toAnimationGroup", "Landroidx/compose/ui/tooling/data/CallGroup;", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class InfiniteTransitionSearch extends Search<InfiniteTransitionSearchInfo> {
        public static final int $stable = 0;

        public InfiniteTransitionSearch(Function1<? super InfiniteTransitionSearchInfo, Unit> function1) {
            super(function1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            Object obj;
            if (toAnimationGroup(group) == null) {
                return false;
            }
            Collection<Object> data = group.getData();
            Collection<Group> children = group.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((Group) it.next()).getData());
            }
            Iterator it2 = CollectionsKt.plus((Collection) data, (Iterable) arrayList).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (obj instanceof InfiniteTransition) {
                    break;
                }
            }
            return (((InfiniteTransition) (obj instanceof InfiniteTransition ? obj : null)) == null || findToolingOverride(group) == null) ? false : true;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> groups) {
            getAnimations().addAll(findAnimations(groups));
        }

        private final CallGroup toAnimationGroup(Group group) {
            if (group.getLocation() == null || !Intrinsics.areEqual(group.getName(), "rememberInfiniteTransition")) {
                group = null;
            }
            if (group == null || !(group instanceof CallGroup)) {
                return null;
            }
            return (CallGroup) group;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.tooling.animation.AnimationSearch$InfiniteTransitionSearchInfo] */
        private final List<InfiniteTransitionSearchInfo> findAnimations(Collection<? extends Group> groups) {
            ToolingState toolingState;
            Object obj;
            ArrayList<CallGroup> arrayList = new ArrayList();
            Iterator it = groups.iterator();
            while (it.hasNext()) {
                CallGroup animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (CallGroup callGroup : arrayList) {
                Collection<Object> data = callGroup.getData();
                Collection<Group> children = callGroup.getChildren();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = children.iterator();
                while (it2.hasNext()) {
                    CollectionsKt.addAll(arrayList3, ((Group) it2.next()).getData());
                }
                Iterator it3 = CollectionsKt.plus((Collection) data, (Iterable) arrayList3).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (obj instanceof InfiniteTransition) {
                        break;
                    }
                }
                if (!(obj instanceof InfiniteTransition)) {
                    obj = null;
                }
                InfiniteTransition infiniteTransition = (InfiniteTransition) obj;
                MutableState<State<Long>> findToolingOverride = findToolingOverride(callGroup);
                if (infiniteTransition != null && findToolingOverride != null) {
                    if (findToolingOverride.getValue() == null) {
                        findToolingOverride.setValue(new ToolingState(0L));
                    }
                    State<Long> value = findToolingOverride.getValue();
                    toolingState = value instanceof ToolingState ? (ToolingState) value : null;
                    if (toolingState == null) {
                        toolingState = new ToolingState(0L);
                    }
                    toolingState = new InfiniteTransitionSearchInfo(infiniteTransition, toolingState);
                }
                if (toolingState != null) {
                    arrayList2.add(toolingState);
                }
            }
            return arrayList2;
        }

        private final MutableState<State<Long>> findToolingOverride(Group group) {
            Object obj;
            Collection<Object> data = group.getData();
            Collection<Group> children = group.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((Group) it.next()).getChildren());
            }
            List plus = CollectionsKt.plus((Collection) children, (Iterable) arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = plus.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList2, ((Group) it2.next()).getData());
            }
            Iterator it3 = CollectionsKt.plus((Collection) data, (Iterable) arrayList2).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (obj instanceof MutableState) {
                    break;
                }
            }
            return (MutableState) (obj instanceof MutableState ? obj : null);
        }
    }

    /* compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B5\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\nHÆ\u0003JK\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "", "animatable", "Landroidx/compose/animation/core/Animatable;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "toolingState", "Landroidx/compose/ui/tooling/animation/ToolingState;", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/tooling/animation/ToolingState;)V", "getAnimatable", "()Landroidx/compose/animation/core/Animatable;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getToolingState", "()Landroidx/compose/ui/tooling/animation/ToolingState;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final /* data */ class AnimateXAsStateSearchInfo<T, V extends AnimationVector> {
        public static final int $stable = 8;
        private final Animatable<T, V> animatable;
        private final AnimationSpec<T> animationSpec;
        private final ToolingState<T> toolingState;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AnimateXAsStateSearchInfo copy$default(AnimateXAsStateSearchInfo animateXAsStateSearchInfo, Animatable animatable, AnimationSpec animationSpec, ToolingState toolingState, int i, Object obj) {
            if ((i & 1) != 0) {
                animatable = animateXAsStateSearchInfo.animatable;
            }
            if ((i & 2) != 0) {
                animationSpec = animateXAsStateSearchInfo.animationSpec;
            }
            if ((i & 4) != 0) {
                toolingState = animateXAsStateSearchInfo.toolingState;
            }
            return animateXAsStateSearchInfo.copy(animatable, animationSpec, toolingState);
        }

        public final Animatable<T, V> component1() {
            return this.animatable;
        }

        public final AnimationSpec<T> component2() {
            return this.animationSpec;
        }

        public final ToolingState<T> component3() {
            return this.toolingState;
        }

        public final AnimateXAsStateSearchInfo<T, V> copy(Animatable<T, V> animatable, AnimationSpec<T> animationSpec, ToolingState<T> toolingState) {
            return new AnimateXAsStateSearchInfo<>(animatable, animationSpec, toolingState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimateXAsStateSearchInfo)) {
                return false;
            }
            AnimateXAsStateSearchInfo animateXAsStateSearchInfo = (AnimateXAsStateSearchInfo) other;
            return Intrinsics.areEqual(this.animatable, animateXAsStateSearchInfo.animatable) && Intrinsics.areEqual(this.animationSpec, animateXAsStateSearchInfo.animationSpec) && Intrinsics.areEqual(this.toolingState, animateXAsStateSearchInfo.toolingState);
        }

        public int hashCode() {
            return (((this.animatable.hashCode() * 31) + this.animationSpec.hashCode()) * 31) + this.toolingState.hashCode();
        }

        public String toString() {
            return "AnimateXAsStateSearchInfo(animatable=" + this.animatable + ", animationSpec=" + this.animationSpec + ", toolingState=" + this.toolingState + ')';
        }

        public AnimateXAsStateSearchInfo(Animatable<T, V> animatable, AnimationSpec<T> animationSpec, ToolingState<T> toolingState) {
            this.animatable = animatable;
            this.animationSpec = animationSpec;
            this.toolingState = toolingState;
        }

        public final Animatable<T, V> getAnimatable() {
            return this.animatable;
        }

        public final AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        public final ToolingState<T> getToolingState() {
            return this.toolingState;
        }
    }

    /* compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B!\u0012\u001a\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J$\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u0002H\r\u0018\u00010\u0012\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J.\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u000e0\u00020\u0014\"\u0004\b\u0000\u0010\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J&\u0010\u0015\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\r\u0018\u00010\u0017\u0018\u00010\u0016\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "findAnimatable", "Landroidx/compose/animation/core/Animatable;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", "group", "Landroidx/compose/ui/tooling/data/CallGroup;", "findAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "findAnimations", "", "findToolingOverride", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/State;", "hasAnimation", "", "toAnimationGroup", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class AnimateXAsStateSearch extends Search<AnimateXAsStateSearchInfo<?, ?>> {
        public static final int $stable = 0;

        public AnimateXAsStateSearch(Function1<? super AnimateXAsStateSearchInfo<?, ?>, Unit> function1) {
            super(function1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            CallGroup animationGroup = toAnimationGroup(group);
            return (animationGroup == null || findAnimatable(animationGroup) == null || findAnimationSpec(animationGroup) == null || findToolingOverride(animationGroup) == null) ? false : true;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> groups) {
            getAnimations().addAll(findAnimations(groups));
        }

        private final CallGroup toAnimationGroup(Group group) {
            if (group.getLocation() == null || !Intrinsics.areEqual(group.getName(), "animateValueAsState")) {
                group = null;
            }
            if (group == null || !(group instanceof CallGroup)) {
                return null;
            }
            return (CallGroup) group;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.tooling.animation.AnimationSearch$AnimateXAsStateSearchInfo] */
        private final <T> List<AnimateXAsStateSearchInfo<T, AnimationVector>> findAnimations(Collection<? extends Group> groups) {
            ArrayList<CallGroup> arrayList = new ArrayList();
            Iterator<T> it = groups.iterator();
            while (it.hasNext()) {
                CallGroup animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (CallGroup callGroup : arrayList) {
                Animatable<T, AnimationVector> findAnimatable = findAnimatable(callGroup);
                AnimationSpec<T> findAnimationSpec = findAnimationSpec(callGroup);
                MutableState<State<T>> findToolingOverride = findToolingOverride(callGroup);
                if (findAnimatable != null && findAnimationSpec != null && findToolingOverride != null) {
                    if (findToolingOverride.getValue() == null) {
                        findToolingOverride.setValue(new ToolingState(findAnimatable.getValue()));
                    }
                    State<T> value = findToolingOverride.getValue();
                    r4 = value instanceof ToolingState ? (ToolingState) value : null;
                    if (r4 == null) {
                        r4 = new ToolingState(findAnimatable.getValue());
                    }
                    r4 = new AnimateXAsStateSearchInfo(findAnimatable, findAnimationSpec, r4);
                }
                if (r4 != null) {
                    arrayList2.add(r4);
                }
            }
            return arrayList2;
        }

        private final <T> AnimationSpec<T> findAnimationSpec(CallGroup group) {
            Collection<Group> children = group.getChildren();
            ArrayList arrayList = new ArrayList();
            for (T t : children) {
                if (Intrinsics.areEqual(((Group) t).getName(), "rememberUpdatedState")) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList4, ((Group) it.next()).getChildren());
            }
            List plus = CollectionsKt.plus((Collection) arrayList3, (Iterable) arrayList4);
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it2 = plus.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList5, ((Group) it2.next()).getData());
            }
            ArrayList arrayList6 = new ArrayList();
            for (T t2 : arrayList5) {
                if (t2 instanceof State) {
                    arrayList6.add(t2);
                }
            }
            ArrayList arrayList7 = arrayList6;
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
            Iterator<T> it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                arrayList8.add(((State) it3.next()).getValue());
            }
            ArrayList arrayList9 = new ArrayList();
            for (T t3 : arrayList8) {
                if (t3 instanceof AnimationSpec) {
                    arrayList9.add(t3);
                }
            }
            return (AnimationSpec) CollectionsKt.firstOrNull((List) arrayList9);
        }

        private final <T> Animatable<T, AnimationVector> findAnimatable(CallGroup group) {
            T t;
            List emptyList;
            T t2;
            T t3;
            CallGroup callGroup = group;
            Iterator<T> it = callGroup.getData().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = (T) null;
                    break;
                }
                t = it.next();
                if (t instanceof Animatable) {
                    break;
                }
            }
            if (!(t instanceof Animatable)) {
                t = null;
            }
            Animatable animatable = t;
            if (animatable == null || (emptyList = CollectionsKt.listOf(animatable)) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            List list = emptyList;
            Collection<Group> children = callGroup.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = children.iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        t3 = (T) null;
                        break;
                    }
                    t3 = it3.next();
                    if (t3 instanceof Animatable) {
                        break;
                    }
                }
                if (!(t3 instanceof Animatable)) {
                    t3 = null;
                }
                Animatable animatable2 = t3;
                if (animatable2 != null) {
                    arrayList.add(animatable2);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it4 = children.iterator();
            while (it4.hasNext()) {
                Group firstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList3.add(firstOrNull);
                }
            }
            ArrayList arrayList4 = arrayList2;
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        t2 = (T) null;
                        break;
                    }
                    t2 = it6.next();
                    if (t2 instanceof Animatable) {
                        break;
                    }
                }
                if (!(t2 instanceof Animatable)) {
                    t2 = null;
                }
                Animatable animatable3 = t2;
                if (animatable3 != null) {
                    arrayList5.add(animatable3);
                }
            }
            return (Animatable) CollectionsKt.firstOrNull(CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.plus((Collection) arrayList4, (Iterable) arrayList5)));
        }

        private final <T> MutableState<State<T>> findToolingOverride(Group group) {
            T t;
            List emptyList;
            T t2;
            T t3;
            Iterator<T> it = group.getData().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t instanceof MutableState) {
                    break;
                }
            }
            if (!(t instanceof MutableState)) {
                t = null;
            }
            MutableState mutableState = (MutableState) t;
            if (mutableState == null || (emptyList = CollectionsKt.listOf(mutableState)) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            List list = emptyList;
            Collection<Group> children = group.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = children.iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        t3 = null;
                        break;
                    }
                    t3 = it3.next();
                    if (t3 instanceof MutableState) {
                        break;
                    }
                }
                if (!(t3 instanceof MutableState)) {
                    t3 = null;
                }
                MutableState mutableState2 = (MutableState) t3;
                if (mutableState2 != null) {
                    arrayList.add(mutableState2);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it4 = children.iterator();
            while (it4.hasNext()) {
                Group firstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList3.add(firstOrNull);
                }
            }
            ArrayList arrayList4 = arrayList2;
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it6.next();
                    if (t2 instanceof MutableState) {
                        break;
                    }
                }
                if (!(t2 instanceof MutableState)) {
                    t2 = null;
                }
                MutableState mutableState3 = (MutableState) t2;
                if (mutableState3 != null) {
                    arrayList5.add(mutableState3);
                }
            }
            return (MutableState) CollectionsKt.firstOrNull(CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.plus((Collection) arrayList4, (Iterable) arrayList5)));
        }
    }

    /* compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "hasAnimation", "", "group", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class AnimateContentSizeSearch extends Search<Object> {
        public static final int $stable = 0;

        public AnimateContentSizeSearch(Function1<Object, Unit> function1) {
            super(function1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            if (!group.getModifierInfo().isEmpty()) {
                List<ModifierInfo> modifierInfo = group.getModifierInfo();
                if (!(modifierInfo instanceof Collection) || !modifierInfo.isEmpty()) {
                    Iterator<T> it = modifierInfo.iterator();
                    while (it.hasNext()) {
                        if (((ModifierInfo) it.next()).getModifier().any(new Function1<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$AnimateContentSizeSearch$hasAnimation$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(Modifier.Element element) {
                                return Boolean.valueOf(Intrinsics.areEqual(element.getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement"));
                            }
                        })) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> groups) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : groups) {
                if (!((Group) obj).getModifierInfo().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((Group) it.next()).getModifierInfo().iterator();
                while (it2.hasNext()) {
                    ((ModifierInfo) it2.next()).getModifier().any(new Function1<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$AnimateContentSizeSearch$addAnimations$2$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(Modifier.Element element) {
                            boolean z;
                            if (Intrinsics.areEqual(element.getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement")) {
                                AnimationSearch.AnimateContentSizeSearch.this.getAnimations().add(element);
                                z = true;
                            } else {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    });
                }
            }
        }
    }

    /* compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\nH\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "hasAnimation", "", "group", "toAnimationGroup", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class TransitionSearch extends Search<Transition<?>> {
        public static final int $stable = 0;

        public TransitionSearch(Function1<? super Transition<?>, Unit> function1) {
            super(function1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            return toAnimationGroup(group) != null;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> groups) {
            Object obj;
            Object obj2;
            Set<Transition<?>> animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = groups.iterator();
            while (it.hasNext()) {
                Group animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it3.next();
                        if (obj2 instanceof Transition) {
                            break;
                        }
                    }
                }
                Transition transition = (Transition) (obj2 instanceof Transition ? obj2 : null);
                if (transition != null) {
                    arrayList3.add(transition);
                }
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Group firstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList5.add(firstOrNull);
                }
            }
            ArrayList arrayList6 = arrayList4;
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it6.next();
                        if (obj instanceof Transition) {
                            break;
                        }
                    }
                }
                if (!(obj instanceof Transition)) {
                    obj = null;
                }
                Transition transition2 = (Transition) obj;
                if (transition2 != null) {
                    arrayList7.add(transition2);
                }
            }
            animations.addAll(CollectionsKt.plus((Collection) arrayList6, (Iterable) arrayList7));
        }

        private final Group toAnimationGroup(Group group) {
            if (group.getLocation() == null || !Intrinsics.areEqual(group.getName(), "updateTransition")) {
                return null;
            }
            return group;
        }
    }

    /* compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\nH\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "hasAnimation", "", "group", "toAnimationGroup", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class AnimatedVisibilitySearch extends Search<Transition<?>> {
        public static final int $stable = 0;

        public AnimatedVisibilitySearch(Function1<? super Transition<?>, Unit> function1) {
            super(function1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            return toAnimationGroup(group) != null;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> groups) {
            Object obj;
            Object obj2;
            Set<Transition<?>> animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = groups.iterator();
            while (it.hasNext()) {
                Group animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it3.next();
                        if (obj2 instanceof Transition) {
                            break;
                        }
                    }
                }
                Transition transition = (Transition) (obj2 instanceof Transition ? obj2 : null);
                if (transition != null) {
                    arrayList3.add(transition);
                }
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Group firstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList5.add(firstOrNull);
                }
            }
            ArrayList arrayList6 = arrayList4;
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it6.next();
                        if (obj instanceof Transition) {
                            break;
                        }
                    }
                }
                if (!(obj instanceof Transition)) {
                    obj = null;
                }
                Transition transition2 = (Transition) obj;
                if (transition2 != null) {
                    arrayList7.add(transition2);
                }
            }
            animations.addAll(CollectionsKt.plus((Collection) arrayList6, (Iterable) arrayList7));
        }

        private final Group toAnimationGroup(Group group) {
            Object obj = null;
            if (group.getLocation() == null || !Intrinsics.areEqual(group.getName(), "AnimatedVisibility")) {
                group = null;
            }
            if (group == null) {
                return null;
            }
            Iterator<T> it = group.getChildren().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((Group) next).getName(), "updateTransition")) {
                    obj = next;
                    break;
                }
            }
            return (Group) obj;
        }
    }

    /* compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\nH\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "hasAnimation", "", "group", "toAnimationGroup", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class AnimatedContentSearch extends Search<Transition<?>> {
        public static final int $stable = 0;

        public AnimatedContentSearch(Function1<? super Transition<?>, Unit> function1) {
            super(function1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            return toAnimationGroup(group) != null;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> groups) {
            Object obj;
            Object obj2;
            Set<Transition<?>> animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = groups.iterator();
            while (it.hasNext()) {
                Group animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it3.next();
                        if (obj2 instanceof Transition) {
                            break;
                        }
                    }
                }
                Transition transition = (Transition) (obj2 instanceof Transition ? obj2 : null);
                if (transition != null) {
                    arrayList3.add(transition);
                }
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Group firstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList5.add(firstOrNull);
                }
            }
            ArrayList arrayList6 = arrayList4;
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it6.next();
                        if (obj instanceof Transition) {
                            break;
                        }
                    }
                }
                if (!(obj instanceof Transition)) {
                    obj = null;
                }
                Transition transition2 = (Transition) obj;
                if (transition2 != null) {
                    arrayList7.add(transition2);
                }
            }
            animations.addAll(CollectionsKt.plus((Collection) arrayList6, (Iterable) arrayList7));
        }

        private final Group toAnimationGroup(Group group) {
            Object obj = null;
            if (group.getLocation() == null || !Intrinsics.areEqual(group.getName(), "AnimatedContent")) {
                group = null;
            }
            if (group == null) {
                return null;
            }
            Iterator<T> it = group.getChildren().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((Group) next).getName(), "updateTransition")) {
                    obj = next;
                    break;
                }
            }
            return (Group) obj;
        }
    }
}

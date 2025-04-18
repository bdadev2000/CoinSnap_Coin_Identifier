package androidx.compose.ui.platform;

import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.collection.ArraySet;
import androidx.collection.IntListKt;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.R;
import com.google.android.gms.common.api.Api;
import d0.b0;
import e0.u;
import e0.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;
import q0.q;

@StabilityInferred
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public static final MutableIntList K = IntListKt.a(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    public final MutableIntIntMap A;
    public final String B;
    public final String C;
    public final URLSpanCache D;
    public final MutableIntObjectMap E;
    public SemanticsNodeCopy F;
    public boolean G;
    public final e H;
    public final ArrayList I;
    public final q0.l J;

    /* renamed from: a */
    public final AndroidComposeView f16267a;

    /* renamed from: b */
    public int f16268b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final q0.l f16269c = new AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(this);
    public final android.view.accessibility.AccessibilityManager d;
    public long e;

    /* renamed from: f */
    public final g f16270f;

    /* renamed from: g */
    public final h f16271g;

    /* renamed from: h */
    public List f16272h;

    /* renamed from: i */
    public final Handler f16273i;

    /* renamed from: j */
    public final ComposeAccessibilityNodeProvider f16274j;

    /* renamed from: k */
    public int f16275k;

    /* renamed from: l */
    public AccessibilityNodeInfoCompat f16276l;

    /* renamed from: m */
    public boolean f16277m;

    /* renamed from: n */
    public final MutableIntObjectMap f16278n;

    /* renamed from: o */
    public final MutableIntObjectMap f16279o;

    /* renamed from: p */
    public final SparseArrayCompat f16280p;

    /* renamed from: q */
    public final SparseArrayCompat f16281q;

    /* renamed from: r */
    public int f16282r;

    /* renamed from: s */
    public Integer f16283s;

    /* renamed from: t */
    public final ArraySet f16284t;

    /* renamed from: u */
    public final d1.b f16285u;

    /* renamed from: v */
    public boolean f16286v;
    public PendingTextTraversedEvent w;
    public MutableIntObjectMap x;

    /* renamed from: y */
    public final MutableIntSet f16287y;

    /* renamed from: z */
    public final MutableIntIntMap f16288z;

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$1 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 implements View.OnAttachStateChangeListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            android.view.accessibility.AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.d;
            accessibilityManager.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f16270f);
            accessibilityManager.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f16271g);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            androidComposeViewAccessibilityDelegateCompat.f16273i.removeCallbacks(androidComposeViewAccessibilityDelegateCompat.H);
            android.view.accessibility.AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.d;
            accessibilityManager.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f16270f);
            accessibilityManager.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f16271g);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class Api24Impl {
        @DoNotInline
        public static final void a(@NotNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @NotNull SemanticsNode semanticsNode) {
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(semanticsNode)) {
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.d, SemanticsActions.f16797g);
                if (accessibilityAction != null) {
                    accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.f16772a));
                }
            }
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class Api29Impl {
        @DoNotInline
        public static final void a(@NotNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @NotNull SemanticsNode semanticsNode) {
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(semanticsNode)) {
                SemanticsPropertyKey semanticsPropertyKey = SemanticsActions.w;
                SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsConfiguration, semanticsPropertyKey);
                if (accessibilityAction != null) {
                    accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, accessibilityAction.f16772a));
                }
                SemanticsPropertyKey semanticsPropertyKey2 = SemanticsActions.f16813y;
                LinkedHashMap linkedHashMap = semanticsConfiguration.f16815a;
                Object obj = linkedHashMap.get(semanticsPropertyKey2);
                if (obj == null) {
                    obj = null;
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
                if (accessibilityAction2 != null) {
                    accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, accessibilityAction2.f16772a));
                }
                Object obj2 = linkedHashMap.get(SemanticsActions.x);
                if (obj2 == null) {
                    obj2 = null;
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) obj2;
                if (accessibilityAction3 != null) {
                    accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, accessibilityAction3.f16772a));
                }
                Object obj3 = linkedHashMap.get(SemanticsActions.f16814z);
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) (obj3 != null ? obj3 : null);
                if (accessibilityAction4 != null) {
                    accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, accessibilityAction4.f16772a));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* loaded from: classes.dex */
    public final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProviderCompat {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final void a(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
            MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.K;
            AndroidComposeViewAccessibilityDelegateCompat.this.a(i2, accessibilityNodeInfoCompat, str, bundle);
        }

        /* JADX WARN: Code restructure failed: missing block: B:264:0x04d3, code lost:
        
            if (p0.a.g(r7, java.lang.Boolean.TRUE) == false) goto L826;
         */
        /* JADX WARN: Code restructure failed: missing block: B:273:0x04f5, code lost:
        
            if (p0.a.g(r1, java.lang.Boolean.TRUE) == false) goto L826;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0951  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x032f  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0334  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x034d  */
        /* JADX WARN: Removed duplicated region for block: B:173:0x0352  */
        /* JADX WARN: Removed duplicated region for block: B:197:0x03ae  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x03b3  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x03d1  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x03d6  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x03e8  */
        /* JADX WARN: Removed duplicated region for block: B:245:0x047f  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x0486  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x04a9  */
        /* JADX WARN: Removed duplicated region for block: B:260:0x04c6  */
        /* JADX WARN: Removed duplicated region for block: B:267:0x04e0  */
        /* JADX WARN: Removed duplicated region for block: B:275:0x0489  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x052d  */
        /* JADX WARN: Removed duplicated region for block: B:288:0x053d  */
        /* JADX WARN: Removed duplicated region for block: B:291:0x0542  */
        /* JADX WARN: Removed duplicated region for block: B:310:0x05d6  */
        /* JADX WARN: Removed duplicated region for block: B:313:0x064b  */
        /* JADX WARN: Removed duplicated region for block: B:316:0x0656  */
        /* JADX WARN: Removed duplicated region for block: B:327:0x068c  */
        /* JADX WARN: Removed duplicated region for block: B:330:0x0696  */
        /* JADX WARN: Removed duplicated region for block: B:346:0x06d0  */
        /* JADX WARN: Removed duplicated region for block: B:357:0x0705  */
        /* JADX WARN: Removed duplicated region for block: B:360:0x070f  */
        /* JADX WARN: Removed duplicated region for block: B:368:0x0735  */
        /* JADX WARN: Removed duplicated region for block: B:371:0x0740  */
        /* JADX WARN: Removed duplicated region for block: B:374:0x0747  */
        /* JADX WARN: Removed duplicated region for block: B:377:0x075a  */
        /* JADX WARN: Removed duplicated region for block: B:435:0x08ee  */
        /* JADX WARN: Removed duplicated region for block: B:438:0x0912  */
        /* JADX WARN: Removed duplicated region for block: B:444:0x0939  */
        /* JADX WARN: Removed duplicated region for block: B:449:0x092e  */
        /* JADX WARN: Removed duplicated region for block: B:450:0x08f4  */
        /* JADX WARN: Removed duplicated region for block: B:460:0x074b  */
        /* JADX WARN: Removed duplicated region for block: B:461:0x05e3  */
        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat b(int r24) {
            /*
                Method dump skipped, instructions count: 2416
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ComposeAccessibilityNodeProvider.b(int):androidx.core.view.accessibility.AccessibilityNodeInfoCompat");
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final AccessibilityNodeInfoCompat c(int i2) {
            return b(AndroidComposeViewAccessibilityDelegateCompat.this.f16275k);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:456:0x0662, code lost:
        
            if (r0 != 16) goto L968;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0054. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:107:0x017a A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0192 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0211  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:227:0x0333  */
        /* JADX WARN: Removed duplicated region for block: B:462:0x071d  */
        /* JADX WARN: Removed duplicated region for block: B:486:0x0772  */
        /* JADX WARN: Removed duplicated region for block: B:488:0x0774  */
        /* JADX WARN: Type inference failed for: r10v10, types: [androidx.compose.ui.platform.AccessibilityIterators$WordTextSegmentIterator, androidx.compose.ui.platform.AccessibilityIterators$AbstractTextSegmentIterator] */
        /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.platform.AccessibilityIterators$AbstractTextSegmentIterator, androidx.compose.ui.platform.AccessibilityIterators$CharacterTextSegmentIterator] */
        /* JADX WARN: Type inference failed for: r9v28, types: [androidx.compose.ui.platform.AccessibilityIterators$AbstractTextSegmentIterator, androidx.compose.ui.platform.AccessibilityIterators$PageTextSegmentIterator] */
        /* JADX WARN: Type inference failed for: r9v31, types: [androidx.compose.ui.platform.AccessibilityIterators$AbstractTextSegmentIterator, androidx.compose.ui.platform.AccessibilityIterators$LineTextSegmentIterator] */
        /* JADX WARN: Type inference failed for: r9v34, types: [androidx.compose.ui.platform.AccessibilityIterators$AbstractTextSegmentIterator, androidx.compose.ui.platform.AccessibilityIterators$ParagraphTextSegmentIterator] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x0177 -> B:77:0x0178). Please report as a decompilation issue!!! */
        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean d(int r20, int r21, android.os.Bundle r22) {
            /*
                Method dump skipped, instructions count: 2072
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ComposeAccessibilityNodeProvider.d(int, int, android.os.Bundle):boolean");
        }
    }

    /* loaded from: classes.dex */
    public static final class LtrBoundsComparator implements Comparator<SemanticsNode> {

        /* renamed from: a */
        public static final LtrBoundsComparator f16294a = new Object();

        @Override // java.util.Comparator
        public final int compare(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
            Rect f2 = semanticsNode.f();
            Rect f3 = semanticsNode2.f();
            int compare = Float.compare(f2.f14914a, f3.f14914a);
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(f2.f14915b, f3.f14915b);
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(f2.d, f3.d);
            return compare3 != 0 ? compare3 : Float.compare(f2.f14916c, f3.f14916c);
        }
    }

    /* loaded from: classes.dex */
    public static final class PendingTextTraversedEvent {

        /* renamed from: a */
        public final SemanticsNode f16295a;

        /* renamed from: b */
        public final int f16296b;

        /* renamed from: c */
        public final int f16297c;
        public final int d;
        public final int e;

        /* renamed from: f */
        public final long f16298f;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i2, int i3, int i4, int i5, long j2) {
            this.f16295a = semanticsNode;
            this.f16296b = i2;
            this.f16297c = i3;
            this.d = i4;
            this.e = i5;
            this.f16298f = j2;
        }
    }

    /* loaded from: classes.dex */
    public static final class RtlBoundsComparator implements Comparator<SemanticsNode> {

        /* renamed from: a */
        public static final RtlBoundsComparator f16299a = new Object();

        @Override // java.util.Comparator
        public final int compare(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
            Rect f2 = semanticsNode.f();
            Rect f3 = semanticsNode2.f();
            int compare = Float.compare(f3.f14916c, f2.f14916c);
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(f2.f14915b, f3.f14915b);
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(f2.d, f3.d);
            return compare3 != 0 ? compare3 : Float.compare(f3.f14914a, f2.f14914a);
        }
    }

    /* loaded from: classes.dex */
    public static final class TopBottomBoundsComparator implements Comparator<d0.k> {

        /* renamed from: a */
        public static final TopBottomBoundsComparator f16300a = new Object();

        @Override // java.util.Comparator
        public final int compare(d0.k kVar, d0.k kVar2) {
            d0.k kVar3 = kVar;
            d0.k kVar4 = kVar2;
            int compare = Float.compare(((Rect) kVar3.f30134a).f14915b, ((Rect) kVar4.f30134a).f14915b);
            return compare != 0 ? compare : Float.compare(((Rect) kVar3.f30134a).d, ((Rect) kVar4.f30134a).d);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.platform.g] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.platform.h] */
    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.f16267a = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        p0.a.q(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.d = accessibilityManager;
        this.e = 100L;
        this.f16270f = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.g
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z2) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                androidComposeViewAccessibilityDelegateCompat.f16272h = z2 ? androidComposeViewAccessibilityDelegateCompat.d.getEnabledAccessibilityServiceList(-1) : w.f30218a;
            }
        };
        this.f16271g = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.h
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z2) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                androidComposeViewAccessibilityDelegateCompat.f16272h = androidComposeViewAccessibilityDelegateCompat.d.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f16272h = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f16273i = new Handler(Looper.getMainLooper());
        this.f16274j = new ComposeAccessibilityNodeProvider();
        this.f16275k = Integer.MIN_VALUE;
        this.f16278n = new MutableIntObjectMap();
        this.f16279o = new MutableIntObjectMap();
        this.f16280p = new SparseArrayCompat(0);
        this.f16281q = new SparseArrayCompat(0);
        this.f16282r = -1;
        this.f16284t = new ArraySet(0);
        this.f16285u = p0.a.a(1, 0, 6);
        this.f16286v = true;
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f1442a;
        p0.a.q(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.x = mutableIntObjectMap;
        this.f16287y = new MutableIntSet();
        this.f16288z = new MutableIntIntMap();
        this.A = new MutableIntIntMap();
        this.B = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.C = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.D = new URLSpanCache();
        this.E = new MutableIntObjectMap();
        SemanticsNode a2 = androidComposeView.getSemanticsOwner().a();
        p0.a.q(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.F = new SemanticsNodeCopy(a2, mutableIntObjectMap);
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            public AnonymousClass1() {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                android.view.accessibility.AccessibilityManager accessibilityManager2 = androidComposeViewAccessibilityDelegateCompat.d;
                accessibilityManager2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f16270f);
                accessibilityManager2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f16271g);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                androidComposeViewAccessibilityDelegateCompat.f16273i.removeCallbacks(androidComposeViewAccessibilityDelegateCompat.H);
                android.view.accessibility.AccessibilityManager accessibilityManager2 = androidComposeViewAccessibilityDelegateCompat.d;
                accessibilityManager2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f16270f);
                accessibilityManager2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f16271g);
            }
        });
        this.H = new e(this, 2);
        this.I = new ArrayList();
        this.J = new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1(this);
    }

    public static CharSequence H(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i2 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i2 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i2);
                p0.a.q(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    public static boolean l(SemanticsNode semanticsNode) {
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(semanticsNode.d, SemanticsProperties.C);
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16849t;
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        Role role = (Role) SemanticsConfigurationKt.a(semanticsConfiguration, semanticsPropertyKey);
        boolean z2 = true;
        boolean z3 = toggleableState != null;
        Object obj = semanticsConfiguration.f16815a.get(SemanticsProperties.B);
        if (obj == null) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return z3;
        }
        bool.booleanValue();
        if (role != null && Role.a(role.f16789a, 4)) {
            z2 = z3;
        }
        return z2;
    }

    public static AnnotatedString n(SemanticsNode semanticsNode) {
        Object obj = semanticsNode.d.f16815a.get(SemanticsProperties.f16852y);
        if (obj == null) {
            obj = null;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.d, SemanticsProperties.f16851v);
        return annotatedString == null ? list != null ? (AnnotatedString) u.F0(list) : null : annotatedString;
    }

    public static String o(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        if (semanticsNode == null) {
            return null;
        }
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16833b;
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        if (semanticsConfiguration.f16815a.containsKey(semanticsPropertyKey)) {
            return ListUtilsKt.a((List) semanticsConfiguration.c(semanticsPropertyKey), ",", null, 62);
        }
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f16852y;
        LinkedHashMap linkedHashMap = semanticsConfiguration.f16815a;
        if (linkedHashMap.containsKey(semanticsPropertyKey2)) {
            Object obj = linkedHashMap.get(semanticsPropertyKey2);
            if (obj == null) {
                obj = null;
            }
            AnnotatedString annotatedString2 = (AnnotatedString) obj;
            if (annotatedString2 != null) {
                return annotatedString2.f16880a;
            }
            return null;
        }
        Object obj2 = linkedHashMap.get(SemanticsProperties.f16851v);
        if (obj2 == null) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list == null || (annotatedString = (AnnotatedString) u.F0(list)) == null) {
            return null;
        }
        return annotatedString.f16880a;
    }

    public static final boolean s(ScrollAxisRange scrollAxisRange, float f2) {
        q0.a aVar = scrollAxisRange.f16790a;
        return (f2 < 0.0f && ((Number) aVar.invoke()).floatValue() > 0.0f) || (f2 > 0.0f && ((Number) aVar.invoke()).floatValue() < ((Number) scrollAxisRange.f16791b.invoke()).floatValue());
    }

    public static final boolean t(ScrollAxisRange scrollAxisRange) {
        q0.a aVar = scrollAxisRange.f16790a;
        float floatValue = ((Number) aVar.invoke()).floatValue();
        boolean z2 = scrollAxisRange.f16792c;
        return (floatValue > 0.0f && !z2) || (((Number) aVar.invoke()).floatValue() < ((Number) scrollAxisRange.f16791b.invoke()).floatValue() && z2);
    }

    public static final boolean u(ScrollAxisRange scrollAxisRange) {
        q0.a aVar = scrollAxisRange.f16790a;
        float floatValue = ((Number) aVar.invoke()).floatValue();
        float floatValue2 = ((Number) scrollAxisRange.f16791b.invoke()).floatValue();
        boolean z2 = scrollAxisRange.f16792c;
        return (floatValue < floatValue2 && !z2) || (((Number) aVar.invoke()).floatValue() > 0.0f && z2);
    }

    public static /* synthetic */ void z(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i2, int i3, Integer num, int i4) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        androidComposeViewAccessibilityDelegateCompat.y(i2, i3, num, null);
    }

    public final void A(int i2, int i3, String str) {
        AccessibilityEvent f2 = f(v(i2), 32);
        f2.setContentChangeTypes(i3);
        if (str != null) {
            f2.getText().add(str);
        }
        x(f2);
    }

    public final void B(int i2) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.w;
        if (pendingTextTraversedEvent != null) {
            SemanticsNode semanticsNode = pendingTextTraversedEvent.f16295a;
            if (i2 != semanticsNode.f16823g) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.f16298f <= 1000) {
                AccessibilityEvent f2 = f(v(semanticsNode.f16823g), Opcodes.ACC_DEPRECATED);
                f2.setFromIndex(pendingTextTraversedEvent.d);
                f2.setToIndex(pendingTextTraversedEvent.e);
                f2.setAction(pendingTextTraversedEvent.f16296b);
                f2.setMovementGranularity(pendingTextTraversedEvent.f16297c);
                f2.getText().add(o(semanticsNode));
                x(f2);
            }
        }
        this.w = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x00c2, code lost:
    
        if (r5 == false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05d1, code lost:
    
        if (r21 != false) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0592, code lost:
    
        if (r3 != null) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0597, code lost:
    
        if (r3 == null) goto L523;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(androidx.collection.IntObjectMap r40) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.C(androidx.collection.IntObjectMap):void");
    }

    public final void D(LayoutNode layoutNode, MutableIntSet mutableIntSet) {
        SemanticsConfiguration w;
        LayoutNode c2;
        if (layoutNode.M() && !this.f16267a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.B.d(8)) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.c(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.f16312a);
            }
            if (layoutNode == null || (w = layoutNode.w()) == null) {
                return;
            }
            if (!w.f16816b && (c2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.c(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.f16311a)) != null) {
                layoutNode = c2;
            }
            int i2 = layoutNode.f15942b;
            if (mutableIntSet.b(i2)) {
                z(this, v(i2), Opcodes.ACC_STRICT, 1, 8);
            }
        }
    }

    public final void E(LayoutNode layoutNode) {
        if (layoutNode.M() && !this.f16267a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int i2 = layoutNode.f15942b;
            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) this.f16278n.c(i2);
            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) this.f16279o.c(i2);
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            AccessibilityEvent f2 = f(i2, 4096);
            if (scrollAxisRange != null) {
                f2.setScrollX((int) ((Number) scrollAxisRange.f16790a.invoke()).floatValue());
                f2.setMaxScrollX((int) ((Number) scrollAxisRange.f16791b.invoke()).floatValue());
            }
            if (scrollAxisRange2 != null) {
                f2.setScrollY((int) ((Number) scrollAxisRange2.f16790a.invoke()).floatValue());
                f2.setMaxScrollY((int) ((Number) scrollAxisRange2.f16791b.invoke()).floatValue());
            }
            x(f2);
        }
    }

    public final boolean F(SemanticsNode semanticsNode, int i2, int i3, boolean z2) {
        String o2;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsActions.f16798h;
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        if (semanticsConfiguration.f16815a.containsKey(semanticsPropertyKey) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(semanticsNode)) {
            q qVar = (q) ((AccessibilityAction) semanticsConfiguration.c(semanticsPropertyKey)).f16773b;
            if (qVar != null) {
                return ((Boolean) qVar.invoke(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
            }
            return false;
        }
        if ((i2 == i3 && i3 == this.f16282r) || (o2 = o(semanticsNode)) == null) {
            return false;
        }
        if (i2 < 0 || i2 != i3 || i3 > o2.length()) {
            i2 = -1;
        }
        this.f16282r = i2;
        boolean z3 = o2.length() > 0;
        int i4 = semanticsNode.f16823g;
        x(g(v(i4), z3 ? Integer.valueOf(this.f16282r) : null, z3 ? Integer.valueOf(this.f16282r) : null, z3 ? Integer.valueOf(o2.length()) : null, o2));
        B(i4);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0 A[LOOP:1: B:8:0x002f->B:26:0x00d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4 A[EDGE_INSN: B:27:0x00d4->B:34:0x00d4 BREAK  A[LOOP:1: B:8:0x002f->B:26:0x00d0], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList G(java.util.ArrayList r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.G(java.util.ArrayList, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0143, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0151, code lost:
    
        if (((r0 & ((~r0) << 6)) & (-9187201950435737472L)) == 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0153, code lost:
    
        r24 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I() {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.I():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        RectF rectF;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) k().c(i2);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.f16596a) == null) {
            return;
        }
        String o2 = o(semanticsNode);
        boolean g2 = p0.a.g(str, this.B);
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f18826a;
        if (g2) {
            int c2 = this.f16288z.c(i2);
            if (c2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, c2);
                return;
            }
            return;
        }
        if (p0.a.g(str, this.C)) {
            int c3 = this.A.c(i2);
            if (c3 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, c3);
                return;
            }
            return;
        }
        SemanticsPropertyKey semanticsPropertyKey = SemanticsActions.f16793a;
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        NodeCoordinator nodeCoordinator = null;
        if (!semanticsConfiguration.f16815a.containsKey(semanticsPropertyKey) || bundle == null || !p0.a.g(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f16850u;
            LinkedHashMap linkedHashMap = semanticsConfiguration.f16815a;
            if (!linkedHashMap.containsKey(semanticsPropertyKey2) || bundle == null || !p0.a.g(str, "androidx.compose.ui.semantics.testTag")) {
                if (p0.a.g(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, semanticsNode.f16823g);
                    return;
                }
                return;
            } else {
                Object obj = linkedHashMap.get(semanticsPropertyKey2);
                String str2 = (String) (obj == null ? null : obj);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i4 > 0 && i3 >= 0) {
            if (i3 < (o2 != null ? o2.length() : Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
                TextLayoutResult c4 = SemanticsUtils_androidKt.c(semanticsConfiguration);
                if (c4 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                while (i5 < i4) {
                    int i6 = i3 + i5;
                    if (i6 >= c4.f17046a.f17038a.f16880a.length()) {
                        arrayList.add(nodeCoordinator);
                    } else {
                        Rect b2 = c4.b(i6);
                        NodeCoordinator c5 = semanticsNode.c();
                        long j2 = 0;
                        if (c5 != null) {
                            if (!c5.k1().f14699n) {
                                c5 = nodeCoordinator;
                            }
                            if (c5 != null) {
                                j2 = c5.e0(0L);
                            }
                        }
                        Rect m2 = b2.m(j2);
                        Rect e = semanticsNode.e();
                        Rect i7 = m2.k(e) ? m2.i(e) : nodeCoordinator;
                        if (i7 != 0) {
                            long a2 = OffsetKt.a(i7.f14914a, i7.f14915b);
                            AndroidComposeView androidComposeView = this.f16267a;
                            long s2 = androidComposeView.s(a2);
                            long s3 = androidComposeView.s(OffsetKt.a(i7.f14916c, i7.d));
                            rectF = new RectF(Offset.g(s2), Offset.h(s2), Offset.g(s3), Offset.h(s3));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i5++;
                    nodeCoordinator = null;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final android.graphics.Rect b(SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds) {
        android.graphics.Rect rect = semanticsNodeWithAdjustedBounds.f16597b;
        long a2 = OffsetKt.a(rect.left, rect.top);
        AndroidComposeView androidComposeView = this.f16267a;
        long s2 = androidComposeView.s(a2);
        long s3 = androidComposeView.s(OffsetKt.a(rect.right, rect.bottom));
        return new android.graphics.Rect((int) Math.floor(Offset.g(s2)), (int) Math.floor(Offset.h(s2)), (int) Math.ceil(Offset.g(s3)), (int) Math.ceil(Offset.h(s3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:14:0x0059, B:19:0x006c, B:21:0x0074, B:24:0x007f, B:26:0x0084, B:28:0x0093, B:30:0x009a, B:31:0x00a3, B:40:0x0042), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:13:0x00c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00be -> B:13:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(h0.g r12) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.c(h0.g):java.lang.Object");
    }

    public final boolean d(long j2, int i2, boolean z2) {
        SemanticsPropertyKey semanticsPropertyKey;
        int i3;
        ScrollAxisRange scrollAxisRange;
        long j3 = j2;
        int i4 = 0;
        if (!p0.a.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        IntObjectMap k2 = k();
        if (!Offset.d(j3, 9205357640488583168L) && Offset.i(j2)) {
            if (z2) {
                semanticsPropertyKey = SemanticsProperties.f16846q;
            } else {
                if (z2) {
                    throw new RuntimeException();
                }
                semanticsPropertyKey = SemanticsProperties.f16845p;
            }
            Object[] objArr = k2.f1441c;
            long[] jArr = k2.f1439a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                boolean z3 = false;
                while (true) {
                    long j4 = jArr[i5];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = i4;
                        while (i8 < i7) {
                            if ((j4 & 255) < 128) {
                                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) objArr[(i5 << 3) + i8];
                                if (RectHelper_androidKt.d(semanticsNodeWithAdjustedBounds.f16597b).a(j3) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNodeWithAdjustedBounds.f16596a.d, semanticsPropertyKey)) != null) {
                                    boolean z4 = scrollAxisRange.f16792c;
                                    int i9 = z4 ? -i2 : i2;
                                    q0.a aVar = scrollAxisRange.f16790a;
                                    if ((i2 != 0 || !z4) && i9 >= 0 ? ((Number) aVar.invoke()).floatValue() < ((Number) scrollAxisRange.f16791b.invoke()).floatValue() : ((Number) aVar.invoke()).floatValue() > 0.0f) {
                                        z3 = true;
                                    }
                                }
                                i3 = 8;
                            } else {
                                i3 = i6;
                            }
                            j4 >>= i3;
                            i8++;
                            i6 = i3;
                            j3 = j2;
                        }
                        if (i7 != i6) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    j3 = j2;
                    i4 = 0;
                }
                return z3;
            }
        }
        return false;
    }

    public final void e() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (p()) {
                w(this.f16267a.getSemanticsOwner().a(), this.F);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                C(k());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    I();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent f(int i2, int i3) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f16267a;
        obtain.setPackageName(androidComposeView.getContext().getPackageName());
        obtain.setSource(androidComposeView, i2);
        if (p() && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) k().c(i2)) != null) {
            obtain.setPassword(semanticsNodeWithAdjustedBounds.f16596a.d.f16815a.containsKey(SemanticsProperties.D));
        }
        return obtain;
    }

    public final AccessibilityEvent g(int i2, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent f2 = f(i2, 8192);
        if (num != null) {
            f2.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            f2.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            f2.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            f2.getText().add(charSequence);
        }
        return f2;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        return this.f16274j;
    }

    public final void h(SemanticsNode semanticsNode, ArrayList arrayList, MutableIntObjectMap mutableIntObjectMap) {
        boolean b2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.b(semanticsNode);
        boolean booleanValue = ((Boolean) semanticsNode.d.d(SemanticsProperties.f16842m, AndroidComposeViewAccessibilityDelegateCompat$geometryDepthFirstSearch$isTraversalGroup$1.f16306a)).booleanValue();
        int i2 = semanticsNode.f16823g;
        if ((booleanValue || q(semanticsNode)) && k().b(i2)) {
            arrayList.add(semanticsNode);
        }
        if (booleanValue) {
            mutableIntObjectMap.i(i2, G(u.b1(SemanticsNode.h(semanticsNode, false, 7)), b2));
            return;
        }
        List h2 = SemanticsNode.h(semanticsNode, false, 7);
        int size = h2.size();
        for (int i3 = 0; i3 < size; i3++) {
            h((SemanticsNode) h2.get(i3), arrayList, mutableIntObjectMap);
        }
    }

    public final int i(SemanticsNode semanticsNode) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16833b;
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        if (!semanticsConfiguration.f16815a.containsKey(semanticsPropertyKey)) {
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f16853z;
            if (semanticsConfiguration.f16815a.containsKey(semanticsPropertyKey2)) {
                return (int) (4294967295L & ((TextRange) semanticsConfiguration.c(semanticsPropertyKey2)).f17058a);
            }
        }
        return this.f16282r;
    }

    public final int j(SemanticsNode semanticsNode) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16833b;
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        if (!semanticsConfiguration.f16815a.containsKey(semanticsPropertyKey)) {
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f16853z;
            if (semanticsConfiguration.f16815a.containsKey(semanticsPropertyKey2)) {
                return (int) (((TextRange) semanticsConfiguration.c(semanticsPropertyKey2)).f17058a >> 32);
            }
        }
        return this.f16282r;
    }

    public final IntObjectMap k() {
        if (this.f16286v) {
            this.f16286v = false;
            this.x = SemanticsUtils_androidKt.a(this.f16267a.getSemanticsOwner());
            if (p()) {
                MutableIntIntMap mutableIntIntMap = this.f16288z;
                mutableIntIntMap.d();
                MutableIntIntMap mutableIntIntMap2 = this.A;
                mutableIntIntMap2.d();
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) k().c(-1);
                SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.f16596a : null;
                p0.a.p(semanticsNode);
                ArrayList G = G(f0.w(semanticsNode), AndroidComposeViewAccessibilityDelegateCompat_androidKt.b(semanticsNode));
                int p2 = f0.p(G);
                int i2 = 1;
                if (1 <= p2) {
                    while (true) {
                        int i3 = ((SemanticsNode) G.get(i2 - 1)).f16823g;
                        int i4 = ((SemanticsNode) G.get(i2)).f16823g;
                        mutableIntIntMap.g(i3, i4);
                        mutableIntIntMap2.g(i4, i3);
                        if (i2 == p2) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return this.x;
    }

    public final String m(SemanticsNode semanticsNode) {
        Object a2 = SemanticsConfigurationKt.a(semanticsNode.d, SemanticsProperties.f16834c);
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.C;
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(semanticsConfiguration, semanticsPropertyKey);
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f16849t;
        LinkedHashMap linkedHashMap = semanticsConfiguration.f16815a;
        Object obj = linkedHashMap.get(semanticsPropertyKey2);
        Object obj2 = null;
        if (obj == null) {
            obj = null;
        }
        Role role = (Role) obj;
        AndroidComposeView androidComposeView = this.f16267a;
        if (toggleableState != null) {
            int ordinal = toggleableState.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2 && a2 == null) {
                        a2 = androidComposeView.getContext().getResources().getString(R.string.indeterminate);
                    }
                } else if (role != null && Role.a(role.f16789a, 2) && a2 == null) {
                    a2 = androidComposeView.getContext().getResources().getString(R.string.state_off);
                }
            } else if (role != null && Role.a(role.f16789a, 2) && a2 == null) {
                a2 = androidComposeView.getContext().getResources().getString(R.string.state_on);
            }
        }
        Object obj3 = linkedHashMap.get(SemanticsProperties.B);
        if (obj3 == null) {
            obj3 = null;
        }
        Boolean bool = (Boolean) obj3;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((role == null || !Role.a(role.f16789a, 4)) && a2 == null) {
                a2 = booleanValue ? androidComposeView.getContext().getResources().getString(R.string.selected) : androidComposeView.getContext().getResources().getString(R.string.not_selected);
            }
        }
        Object obj4 = linkedHashMap.get(SemanticsProperties.d);
        if (obj4 == null) {
            obj4 = null;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj4;
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.d) {
                if (a2 == null) {
                    w0.d dVar = progressBarRangeInfo.f16787b;
                    float floatValue = Float.valueOf(dVar.f31405b).floatValue();
                    float f2 = dVar.f31404a;
                    float floatValue2 = floatValue - Float.valueOf(f2).floatValue() == 0.0f ? 0.0f : (progressBarRangeInfo.f16786a - Float.valueOf(f2).floatValue()) / (Float.valueOf(dVar.f31405b).floatValue() - Float.valueOf(f2).floatValue());
                    if (floatValue2 < 0.0f) {
                        floatValue2 = 0.0f;
                    }
                    if (floatValue2 > 1.0f) {
                        floatValue2 = 1.0f;
                    }
                    a2 = androidComposeView.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(floatValue2 == 0.0f ? 0 : floatValue2 == 1.0f ? 100 : p0.a.A(Math.round(floatValue2 * 100), 1, 99)));
                }
            } else if (a2 == null) {
                a2 = androidComposeView.getContext().getResources().getString(R.string.in_progress);
            }
        }
        SemanticsPropertyKey semanticsPropertyKey3 = SemanticsProperties.f16852y;
        if (linkedHashMap.containsKey(semanticsPropertyKey3)) {
            SemanticsConfiguration i2 = new SemanticsNode(semanticsNode.f16819a, true, semanticsNode.f16821c, semanticsConfiguration).i();
            Collection collection = (Collection) SemanticsConfigurationKt.a(i2, SemanticsProperties.f16833b);
            if (collection == null || collection.isEmpty()) {
                SemanticsPropertyKey semanticsPropertyKey4 = SemanticsProperties.f16851v;
                LinkedHashMap linkedHashMap2 = i2.f16815a;
                Object obj5 = linkedHashMap2.get(semanticsPropertyKey4);
                if (obj5 == null) {
                    obj5 = null;
                }
                Collection collection2 = (Collection) obj5;
                if (collection2 == null || collection2.isEmpty()) {
                    Object obj6 = linkedHashMap2.get(semanticsPropertyKey3);
                    if (obj6 == null) {
                        obj6 = null;
                    }
                    CharSequence charSequence = (CharSequence) obj6;
                    if (charSequence == null || charSequence.length() == 0) {
                        obj2 = androidComposeView.getContext().getResources().getString(R.string.state_empty);
                    }
                }
            }
            a2 = obj2;
        }
        return (String) a2;
    }

    public final boolean p() {
        return this.d.isEnabled() && (this.f16272h.isEmpty() ^ true);
    }

    public final boolean q(SemanticsNode semanticsNode) {
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.d, SemanticsProperties.f16833b);
        boolean z2 = ((list != null ? (String) u.F0(list) : null) == null && n(semanticsNode) == null && m(semanticsNode) == null && !l(semanticsNode)) ? false : true;
        if (semanticsNode.d.f16816b) {
            return true;
        }
        return semanticsNode.m() && z2;
    }

    public final void r(LayoutNode layoutNode) {
        if (this.f16284t.add(layoutNode)) {
            this.f16285u.b(b0.f30125a);
        }
    }

    public final int v(int i2) {
        if (i2 == this.f16267a.getSemanticsOwner().a().f16823g) {
            return -1;
        }
        return i2;
    }

    public final void w(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        int[] iArr = IntSetKt.f1446a;
        MutableIntSet mutableIntSet = new MutableIntSet();
        List h2 = SemanticsNode.h(semanticsNode, true, 4);
        int size = h2.size();
        int i2 = 0;
        while (true) {
            LayoutNode layoutNode = semanticsNode.f16821c;
            if (i2 >= size) {
                MutableIntSet mutableIntSet2 = semanticsNodeCopy.f16595b;
                int[] iArr2 = mutableIntSet2.f1444b;
                long[] jArr = mutableIntSet2.f1443a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j2 & 255) < 128 && !mutableIntSet.a(iArr2[(i3 << 3) + i5])) {
                                    r(layoutNode);
                                    return;
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                List h3 = SemanticsNode.h(semanticsNode, true, 4);
                int size2 = h3.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    SemanticsNode semanticsNode2 = (SemanticsNode) h3.get(i6);
                    if (k().a(semanticsNode2.f16823g)) {
                        Object c2 = this.E.c(semanticsNode2.f16823g);
                        p0.a.p(c2);
                        w(semanticsNode2, (SemanticsNodeCopy) c2);
                    }
                }
                return;
            }
            SemanticsNode semanticsNode3 = (SemanticsNode) h2.get(i2);
            if (k().a(semanticsNode3.f16823g)) {
                MutableIntSet mutableIntSet3 = semanticsNodeCopy.f16595b;
                int i7 = semanticsNode3.f16823g;
                if (!mutableIntSet3.a(i7)) {
                    r(layoutNode);
                    return;
                }
                mutableIntSet.b(i7);
            }
            i2++;
        }
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!p()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f16277m = true;
        }
        try {
            return ((Boolean) ((AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1) this.f16269c).invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f16277m = false;
        }
    }

    public final boolean y(int i2, int i3, Integer num, List list) {
        if (i2 == Integer.MIN_VALUE || !p()) {
            return false;
        }
        AccessibilityEvent f2 = f(i2, i3);
        if (num != null) {
            f2.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            f2.setContentDescription(ListUtilsKt.a(list, ",", null, 62));
        }
        Trace.beginSection("sendEvent");
        try {
            return x(f2);
        } finally {
            Trace.endSection();
        }
    }
}

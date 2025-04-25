package com.glority.android.netpromoterscore;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.app.NotificationCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.netpromoterscore.databinding.DialogNetPromoterScoreBinding;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ViewUtils;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetPromoterScoreDialog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B-\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0003J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u001c\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\u0012\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010$\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010 H\u0016J$\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010#\u001a\u0004\u0018\u00010 H\u0016J\b\u0010+\u001a\u00020\u0015H\u0002J\u001a\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010 H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/glority/android/netpromoterscore/NetPromoterScoreDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "startColor", "", "endColor", "anchorActivity", "", "timeShift", "", "(IILjava/lang/String;J)V", "binding", "Lcom/glority/android/netpromoterscore/databinding/DialogNetPromoterScoreBinding;", "scores", "", "Landroid/widget/TextView;", "getScores", "()Ljava/util/List;", "scores$delegate", "Lkotlin/Lazy;", "disableSubmitButton", "", "doCreateView", "enableSubmitButton", "generateShapeBackground", "Landroid/graphics/drawable/GradientDrawable;", "initButtonBackground", "initListener", "initScores", "logEvent", NotificationCompat.CATEGORY_EVENT, "bundle", "Landroid/os/Bundle;", "observeSoftInput", "onActivityCreated", "savedInstanceState", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onSoftInputKeyboardVisible", "onViewCreated", "view", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class NetPromoterScoreDialog extends DialogFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int SCORE_THRESHOLD = 6;
    private static final String TAG = "__net_promoter_score_dialog__";
    private final String anchorActivity;
    private DialogNetPromoterScoreBinding binding;
    private final int endColor;

    /* renamed from: scores$delegate, reason: from kotlin metadata */
    private final Lazy scores;
    private final int startColor;
    private final long timeShift;

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TextView> getScores() {
        return (List) this.scores.getValue();
    }

    @JvmStatic
    public static final void start(FragmentManager fragmentManager, int i, int i2, String str, long j) {
        INSTANCE.start(fragmentManager, i, i2, str, j);
    }

    public static final /* synthetic */ DialogNetPromoterScoreBinding access$getBinding$p(NetPromoterScoreDialog netPromoterScoreDialog) {
        DialogNetPromoterScoreBinding dialogNetPromoterScoreBinding = netPromoterScoreDialog.binding;
        if (dialogNetPromoterScoreBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        return dialogNetPromoterScoreBinding;
    }

    public /* synthetic */ NetPromoterScoreDialog(int i, int i2, String str, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, (i3 & 8) != 0 ? 0L : j);
    }

    public NetPromoterScoreDialog(int i, int i2, String str, long j) {
        this.startColor = i;
        this.endColor = i2;
        this.anchorActivity = str;
        this.timeShift = j;
        this.scores = LazyKt.lazy(new Function0<List<? extends TextView>>() { // from class: com.glority.android.netpromoterscore.NetPromoterScoreDialog$scores$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends TextView> invoke() {
                return CollectionsKt.listOf((Object[]) new TextView[]{NetPromoterScoreDialog.access$getBinding$p(NetPromoterScoreDialog.this).tvNpsScore00, NetPromoterScoreDialog.access$getBinding$p(NetPromoterScoreDialog.this).tvNpsScore01, NetPromoterScoreDialog.access$getBinding$p(NetPromoterScoreDialog.this).tvNpsScore02, NetPromoterScoreDialog.access$getBinding$p(NetPromoterScoreDialog.this).tvNpsScore03, NetPromoterScoreDialog.access$getBinding$p(NetPromoterScoreDialog.this).tvNpsScore04, NetPromoterScoreDialog.access$getBinding$p(NetPromoterScoreDialog.this).tvNpsScore05, NetPromoterScoreDialog.access$getBinding$p(NetPromoterScoreDialog.this).tvNpsScore06, NetPromoterScoreDialog.access$getBinding$p(NetPromoterScoreDialog.this).tvNpsScore07, NetPromoterScoreDialog.access$getBinding$p(NetPromoterScoreDialog.this).tvNpsScore08, NetPromoterScoreDialog.access$getBinding$p(NetPromoterScoreDialog.this).tvNpsScore09, NetPromoterScoreDialog.access$getBinding$p(NetPromoterScoreDialog.this).tvNpsScore10});
            }
        });
    }

    /* compiled from: NetPromoterScoreDialog.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/glority/android/netpromoterscore/NetPromoterScoreDialog$Companion;", "", "()V", "SCORE_THRESHOLD", "", "TAG", "", "start", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "startColor", "endColor", "anchorActivity", "timeShift", "", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void start$default(Companion companion, FragmentManager fragmentManager, int i, int i2, String str, long j, int i3, Object obj) {
            if ((i3 & 16) != 0) {
                j = 0;
            }
            companion.start(fragmentManager, i, i2, str, j);
        }

        @JvmStatic
        public final void start(FragmentManager fragmentManager, int startColor, int endColor, String anchorActivity, long timeShift) {
            if (fragmentManager != null) {
                try {
                    new NetPromoterScoreDialog(startColor, endColor, anchorActivity, timeShift).show(fragmentManager, NetPromoterScoreDialog.TAG);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
            }
        }
    }

    public NetPromoterScoreDialog() {
        this(R.color.NpsStartColor, R.color.NpsEndColor, null, 0L, 8, null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, R.style.BaseDialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        Window window;
        Window window2;
        Window window3;
        super.onActivityCreated(savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.setGravity(80);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window = dialog3.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(inflater, R.layout.dialog_net_promoter_score, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "DataBindingUtil.inflate(…_score, container, false)");
        DialogNetPromoterScoreBinding dialogNetPromoterScoreBinding = (DialogNetPromoterScoreBinding) inflate;
        this.binding = dialogNetPromoterScoreBinding;
        if (dialogNetPromoterScoreBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        View root = dialogNetPromoterScoreBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        logEvent$default(this, NpsLogEvents.NPS_DIALOG_EXPOSURE, null, 2, null);
        setCancelable(false);
        doCreateView();
    }

    private final void doCreateView() {
        initScores();
        initButtonBackground();
        initListener();
        disableSubmitButton();
        observeSoftInput();
    }

    private final void initListener() {
        DialogNetPromoterScoreBinding dialogNetPromoterScoreBinding = this.binding;
        if (dialogNetPromoterScoreBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        ImageView imageView = dialogNetPromoterScoreBinding.ivNpsDialogClose;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivNpsDialogClose");
        ViewExtensionsKt.setSingleClickListener$default(imageView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.netpromoterscore.NetPromoterScoreDialog$initListener$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                NetPromoterScoreDialog.logEvent$default(NetPromoterScoreDialog.this, NpsLogEvents.NPS_CLOSE_CLICK, null, 2, null);
                NetPromoterScoreDialog.this.dismiss();
            }
        }, 1, (Object) null);
        DialogNetPromoterScoreBinding dialogNetPromoterScoreBinding2 = this.binding;
        if (dialogNetPromoterScoreBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        TextView textView = dialogNetPromoterScoreBinding2.tvNpsDialogSubmit;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvNpsDialogSubmit");
        ViewExtensionsKt.setSingleClickListener$default(textView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.netpromoterscore.NetPromoterScoreDialog$initListener$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                List scores;
                Intrinsics.checkNotNullParameter(it, "it");
                scores = NetPromoterScoreDialog.this.getScores();
                Iterator it2 = scores.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    } else if (((TextView) it2.next()).isSelected()) {
                        break;
                    } else {
                        i++;
                    }
                }
                AppCompatEditText appCompatEditText = NetPromoterScoreDialog.access$getBinding$p(NetPromoterScoreDialog.this).etNpsExperienceInput;
                Intrinsics.checkNotNullExpressionValue(appCompatEditText, "binding.etNpsExperienceInput");
                String valueOf = String.valueOf(appCompatEditText.getText());
                Bundle logEventBundleOf = LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("value", Integer.valueOf(i)));
                if (i <= 6) {
                    logEventBundleOf = LogEventArgumentsKt.logEventBundleAdd(logEventBundleOf, TuplesKt.to("content", valueOf));
                }
                NetPromoterScoreDialog.this.logEvent(NpsLogEvents.NPS_SUBMIT_CLICK, logEventBundleOf);
                Toast.makeText(NetPromoterScoreDialog.this.getContext(), R.string.text_thank_you_for_feedback, 1).show();
                NetPromoterScoreDialog.this.dismiss();
            }
        }, 1, (Object) null);
        DialogNetPromoterScoreBinding dialogNetPromoterScoreBinding3 = this.binding;
        if (dialogNetPromoterScoreBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        dialogNetPromoterScoreBinding3.etNpsExperienceInput.setOnTouchListener(new View.OnTouchListener() { // from class: com.glority.android.netpromoterscore.NetPromoterScoreDialog$initListener$3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ViewParent parent;
                ViewParent parent2;
                if ((motionEvent == null || motionEvent.getAction() != 0) && (motionEvent == null || motionEvent.getAction() != 2)) {
                    if (motionEvent != null && motionEvent.getAction() == 1 && view != null && (parent = view.getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                    }
                } else if (view != null && (parent2 = view.getParent()) != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                return false;
            }
        });
        DialogNetPromoterScoreBinding dialogNetPromoterScoreBinding4 = this.binding;
        if (dialogNetPromoterScoreBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        dialogNetPromoterScoreBinding4.etNpsExperienceInput.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.glority.android.netpromoterscore.NetPromoterScoreDialog$initListener$4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                ViewUtils.hideSoftInput(NetPromoterScoreDialog.access$getBinding$p(NetPromoterScoreDialog.this).etNpsExperienceInput);
            }
        });
    }

    private final void initScores() {
        final int i;
        DialogNetPromoterScoreBinding dialogNetPromoterScoreBinding = this.binding;
        if (dialogNetPromoterScoreBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        AppCompatEditText appCompatEditText = dialogNetPromoterScoreBinding.etNpsExperienceInput;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText, "binding.etNpsExperienceInput");
        appCompatEditText.setVisibility(8);
        Iterator<T> it = getScores().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            } else {
                ((TextView) it.next()).setSelected(false);
            }
        }
        for (Object obj : getScores()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ViewExtensionsKt.setSingleClickListener$default((TextView) obj, 0L, new Function1<View, Unit>() { // from class: com.glority.android.netpromoterscore.NetPromoterScoreDialog$initScores$$inlined$forEachIndexed$lambda$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it2) {
                    List scores;
                    Intrinsics.checkNotNullParameter(it2, "it");
                    this.logEvent(NpsLogEvents.NPS_SCORE_CLICK, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("value", Integer.valueOf(i))));
                    this.enableSubmitButton();
                    scores = this.getScores();
                    Iterator it3 = scores.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        } else {
                            ((TextView) it3.next()).setSelected(false);
                        }
                    }
                    it2.setSelected(true);
                    AppCompatEditText appCompatEditText2 = NetPromoterScoreDialog.access$getBinding$p(this).etNpsExperienceInput;
                    Intrinsics.checkNotNullExpressionValue(appCompatEditText2, "binding.etNpsExperienceInput");
                    appCompatEditText2.setVisibility(i <= 6 ? 0 : 8);
                }
            }, 1, (Object) null);
            i = i2;
        }
    }

    private final void observeSoftInput() {
        DialogNetPromoterScoreBinding dialogNetPromoterScoreBinding = this.binding;
        if (dialogNetPromoterScoreBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        View root = dialogNetPromoterScoreBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        root.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.glority.android.netpromoterscore.NetPromoterScoreDialog$observeSoftInput$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Window window;
                View decorView;
                Rect rect = new Rect();
                Dialog dialog = NetPromoterScoreDialog.this.getDialog();
                if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                    return;
                }
                decorView.getWindowVisibleDisplayFrame(rect);
                if (ViewUtils.getScreenHeight() - rect.bottom > ViewUtils.getScreenHeight() / 4) {
                    NetPromoterScoreDialog.this.onSoftInputKeyboardVisible();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSoftInputKeyboardVisible() {
        DialogNetPromoterScoreBinding dialogNetPromoterScoreBinding = this.binding;
        if (dialogNetPromoterScoreBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        dialogNetPromoterScoreBinding.npsScrollview.post(new Runnable() { // from class: com.glority.android.netpromoterscore.NetPromoterScoreDialog$onSoftInputKeyboardVisible$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Boolean.valueOf(NetPromoterScoreDialog.access$getBinding$p(NetPromoterScoreDialog.this).npsScrollview.fullScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS));
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
            }
        });
    }

    private final void disableSubmitButton() {
        DialogNetPromoterScoreBinding dialogNetPromoterScoreBinding = this.binding;
        if (dialogNetPromoterScoreBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        TextView textView = dialogNetPromoterScoreBinding.tvNpsDialogSubmit;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvNpsDialogSubmit");
        textView.setClickable(false);
        DialogNetPromoterScoreBinding dialogNetPromoterScoreBinding2 = this.binding;
        if (dialogNetPromoterScoreBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        TextView textView2 = dialogNetPromoterScoreBinding2.tvNpsDialogSubmit;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvNpsDialogSubmit");
        textView2.setAlpha(0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableSubmitButton() {
        DialogNetPromoterScoreBinding dialogNetPromoterScoreBinding = this.binding;
        if (dialogNetPromoterScoreBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        TextView textView = dialogNetPromoterScoreBinding.tvNpsDialogSubmit;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvNpsDialogSubmit");
        textView.setClickable(true);
        DialogNetPromoterScoreBinding dialogNetPromoterScoreBinding2 = this.binding;
        if (dialogNetPromoterScoreBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        TextView textView2 = dialogNetPromoterScoreBinding2.tvNpsDialogSubmit;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvNpsDialogSubmit");
        textView2.setAlpha(1.0f);
    }

    private final void initButtonBackground() {
        GradientDrawable generateShapeBackground = generateShapeBackground();
        DialogNetPromoterScoreBinding dialogNetPromoterScoreBinding = this.binding;
        if (dialogNetPromoterScoreBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        TextView textView = dialogNetPromoterScoreBinding.tvNpsDialogSubmit;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvNpsDialogSubmit");
        textView.setBackground(generateShapeBackground);
    }

    private final GradientDrawable generateShapeBackground() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{getResources().getColor(this.startColor), getResources().getColor(this.endColor)});
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(getResources().getDimension(R.dimen.x200));
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void logEvent$default(NetPromoterScoreDialog netPromoterScoreDialog, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        netPromoterScoreDialog.logEvent(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logEvent(String event, Bundle bundle) {
        Bundle logEventBundleOf = LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("from", this.anchorActivity), TuplesKt.to("time", Long.valueOf(this.timeShift)));
        if (bundle != null) {
            logEventBundleOf.putAll(bundle);
        }
        new LogEventRequest(event, logEventBundleOf).post();
    }
}

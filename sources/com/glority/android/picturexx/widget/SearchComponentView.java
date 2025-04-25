package com.glority.android.picturexx.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.GlSearchViewBinding;
import com.glority.android.picturexx.widget.SearchComponentView;
import com.glority.utils.ui.ViewUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: SearchComponentView.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004ABCDB\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010*\u001a\u00020+2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u001e\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020!2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020+0/J\b\u00100\u001a\u00020+H\u0002J\u0010\u00101\u001a\u00020+2\u0006\u00102\u001a\u00020\u000bH\u0002J\u000e\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020!J\u000e\u00105\u001a\u00020+2\u0006\u00104\u001a\u00020!J\u000e\u00106\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u00107\u001a\u00020+2\u0006\u00108\u001a\u00020\u000bJ\u000e\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020\tJ\u000e\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020\u000bJ\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0>H\u0002J\u0010\u0010?\u001a\u00020+2\u0006\u00102\u001a\u00020\u000bH\u0002J\b\u0010@\u001a\u00020+H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R8\u0010\u0012\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0016j\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014`\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/glority/android/picturexx/widget/SearchComponentView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageHolder", "", "spName", "", "job", "Lkotlinx/coroutines/Job;", "adapter", "Lcom/glority/android/picturexx/widget/SearchComponentView$SimpleAdapter;", "recentAdapter", "Lcom/glority/android/picturexx/widget/SearchComponentView$RecentSearchAdapter;", "searchCache", "Lkotlin/collections/HashMap;", "", "Lcom/glority/android/picturexx/widget/SearchComponentView$SearchEntity;", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "callback", "Lcom/glority/android/picturexx/widget/SearchComponentView$SearchCallback;", "lifecycleCoroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "binding", "Lcom/glority/android/picturexx/business/databinding/GlSearchViewBinding;", "recentSearchList", "Ljava/util/ArrayList;", "showRecent", "", "searchHint", "highLightColor", "maxRecentCount", "getMaxRecentCount", "()I", "setMaxRecentCount", "(I)V", "originalEtWidth", "init", "", "searchBarExpandAnimation", "visible", "done", "Lkotlin/Function0;", "initRecent", "search", "keyword", "showBackIcon", "show", "showRecordSearch", "setAdapter", "setSearchHint", "hint", "setImageHolder", "holder", "setHighLightColor", "color", "getRecentSearchName", "", "updateRecentSearch", "clearRecentSearch", "SearchEntity", "SearchCallback", "SimpleAdapter", "RecentSearchAdapter", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SearchComponentView extends FrameLayout {
    public static final int $stable = 8;
    private SimpleAdapter adapter;
    private final GlSearchViewBinding binding;
    private SearchCallback callback;
    private String highLightColor;
    private int imageHolder;
    private Job job;
    private LifecycleCoroutineScope lifecycleCoroutineScope;
    private int maxRecentCount;
    private int originalEtWidth;
    private final RecentSearchAdapter recentAdapter;
    private final ArrayList<String> recentSearchList;
    private HashMap<String, List<SearchEntity>> searchCache;
    private String searchHint;
    private boolean showRecent;
    private final String spName;

    /* compiled from: SearchComponentView.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0006H&J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH&J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H&¨\u0006\u0012"}, d2 = {"Lcom/glority/android/picturexx/widget/SearchComponentView$SearchCallback;", "", "searchEmptyView", "Landroid/view/View;", "noSearchDisplayView", "searchType", "", "doSearchBlocking", "", "Lcom/glority/android/picturexx/widget/SearchComponentView$SearchEntity;", "keyword", "onItemClick", "", "view", "position", "", "searchEntity", "clickBack", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public interface SearchCallback {
        void clickBack(View view);

        List<SearchEntity> doSearchBlocking(String keyword);

        View noSearchDisplayView();

        void onItemClick(View view, int position, SearchEntity searchEntity);

        View searchEmptyView();

        String searchType();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchComponentView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SearchComponentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* compiled from: SearchComponentView.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/glority/android/picturexx/widget/SearchComponentView$SearchEntity;", "", "imageUrl", "", "name", "desc", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getName", "getDesc", "getId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final /* data */ class SearchEntity {
        public static final int $stable = 0;
        private final String desc;
        private final String id;
        private final String imageUrl;
        private final String name;

        /* renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDesc() {
            return this.desc;
        }

        /* renamed from: component4, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final SearchEntity copy(String imageUrl, String name, String desc, String id) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            Intrinsics.checkNotNullParameter(id, "id");
            return new SearchEntity(imageUrl, name, desc, id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchEntity)) {
                return false;
            }
            SearchEntity searchEntity = (SearchEntity) other;
            return Intrinsics.areEqual(this.imageUrl, searchEntity.imageUrl) && Intrinsics.areEqual(this.name, searchEntity.name) && Intrinsics.areEqual(this.desc, searchEntity.desc) && Intrinsics.areEqual(this.id, searchEntity.id);
        }

        public int hashCode() {
            return (((((this.imageUrl.hashCode() * 31) + this.name.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.id.hashCode();
        }

        public String toString() {
            return "SearchEntity(imageUrl=" + this.imageUrl + ", name=" + this.name + ", desc=" + this.desc + ", id=" + this.id + ")";
        }

        public SearchEntity(String imageUrl, String name, String desc, String id) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            Intrinsics.checkNotNullParameter(id, "id");
            this.imageUrl = imageUrl;
            this.name = name;
            this.desc = desc;
            this.id = id;
        }

        public static /* synthetic */ SearchEntity copy$default(SearchEntity searchEntity, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = searchEntity.imageUrl;
            }
            if ((i & 2) != 0) {
                str2 = searchEntity.name;
            }
            if ((i & 4) != 0) {
                str3 = searchEntity.desc;
            }
            if ((i & 8) != 0) {
                str4 = searchEntity.id;
            }
            return searchEntity.copy(str, str2, str3, str4);
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getName() {
            return this.name;
        }

        public final String getDesc() {
            return this.desc;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchComponentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.imageHolder = R.drawable.gl_custom_image_holder;
        this.spName = "searchRecent";
        this.adapter = new SimpleAdapter(this, R.layout.gl_item_seach_view);
        this.recentAdapter = new RecentSearchAdapter();
        this.searchCache = new HashMap<>();
        GlSearchViewBinding inflate = GlSearchViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.recentSearchList = new ArrayList<>();
        this.showRecent = true;
        this.searchHint = "Search";
        this.highLightColor = "#FAAF19";
        this.maxRecentCount = 6;
    }

    public final int getMaxRecentCount() {
        return this.maxRecentCount;
    }

    public final void setMaxRecentCount(int i) {
        this.maxRecentCount = i;
    }

    public final void init(final SearchCallback callback, LifecycleCoroutineScope lifecycleCoroutineScope) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "lifecycleCoroutineScope");
        this.callback = callback;
        this.lifecycleCoroutineScope = lifecycleCoroutineScope;
        EditText et = this.binding.et;
        Intrinsics.checkNotNullExpressionValue(et, "et");
        et.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.widget.SearchComponentView$init$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                GlSearchViewBinding glSearchViewBinding;
                String str;
                SearchComponentView.SimpleAdapter simpleAdapter;
                String obj;
                boolean z = (s == null || (obj = s.toString()) == null || obj.length() <= 0) ? false : true;
                glSearchViewBinding = SearchComponentView.this.binding;
                ImageView deleteIv = glSearchViewBinding.deleteIv;
                Intrinsics.checkNotNullExpressionValue(deleteIv, "deleteIv");
                deleteIv.setVisibility(z ^ true ? 4 : 0);
                if (!z) {
                    simpleAdapter = SearchComponentView.this.adapter;
                    simpleAdapter.setEmptyView(new View(SearchComponentView.this.getContext()));
                }
                SearchComponentView searchComponentView = SearchComponentView.this;
                if (s == null || (str = s.toString()) == null) {
                    str = "";
                }
                searchComponentView.search(str);
            }
        });
        this.binding.backIv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.widget.SearchComponentView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchComponentView.init$lambda$1(SearchComponentView.SearchCallback.this, view);
            }
        });
        this.binding.deleteIv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.widget.SearchComponentView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchComponentView.init$lambda$2(SearchComponentView.this, view);
            }
        });
        this.binding.recentRv.setAdapter(this.recentAdapter);
        this.binding.recentRv.setOnTouchListener(new View.OnTouchListener() { // from class: com.glority.android.picturexx.widget.SearchComponentView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean init$lambda$3;
                init$lambda$3 = SearchComponentView.init$lambda$3(SearchComponentView.this, view, motionEvent);
                return init$lambda$3;
            }
        });
        this.binding.rv.setOnTouchListener(new View.OnTouchListener() { // from class: com.glority.android.picturexx.widget.SearchComponentView$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean init$lambda$4;
                init$lambda$4 = SearchComponentView.init$lambda$4(SearchComponentView.this, view, motionEvent);
                return init$lambda$4;
            }
        });
        setAdapter(this.adapter);
        initRecent();
        searchBarExpandAnimation$default(this, true, null, 2, null);
        View noSearchDisplayView = callback.noSearchDisplayView();
        if (noSearchDisplayView != null) {
            this.binding.noSearchLayout.addView(noSearchDisplayView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(SearchCallback callback, View view) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNull(view);
        callback.clickBack(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2(SearchComponentView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.binding.et.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean init$lambda$3(SearchComponentView this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        ViewUtils.hideSoftInput((Activity) context);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean init$lambda$4(SearchComponentView this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        ViewUtils.hideSoftInput((Activity) context);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void searchBarExpandAnimation$default(SearchComponentView searchComponentView, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: com.glority.android.picturexx.widget.SearchComponentView$searchBarExpandAnimation$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        searchComponentView.searchBarExpandAnimation(z, function0);
    }

    public final void searchBarExpandAnimation(final boolean visible, final Function0<Unit> done) {
        Intrinsics.checkNotNullParameter(done, "done");
        this.binding.et.post(new Runnable() { // from class: com.glority.android.picturexx.widget.SearchComponentView$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                SearchComponentView.searchBarExpandAnimation$lambda$8(SearchComponentView.this, visible, done);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void searchBarExpandAnimation$lambda$8(final SearchComponentView this$0, final boolean z, final Function0 done) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(done, "$done");
        if (this$0.originalEtWidth == 0) {
            this$0.originalEtWidth = this$0.binding.et.getWidth();
        }
        int dimensionPixelOffset = this$0.binding.et.getResources().getDisplayMetrics().widthPixels - this$0.binding.et.getResources().getDimensionPixelOffset(R.dimen.x212);
        int[] iArr = new int[2];
        iArr[0] = z ? this$0.binding.et.getWidth() : dimensionPixelOffset;
        if (!z) {
            dimensionPixelOffset = this$0.originalEtWidth;
        }
        iArr[1] = dimensionPixelOffset;
        ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.android.picturexx.widget.SearchComponentView$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchComponentView.searchBarExpandAnimation$lambda$8$lambda$7$lambda$6(SearchComponentView.this, valueAnimator);
            }
        });
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: com.glority.android.picturexx.widget.SearchComponentView$searchBarExpandAnimation$2$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                GlSearchViewBinding glSearchViewBinding;
                GlSearchViewBinding glSearchViewBinding2;
                GlSearchViewBinding glSearchViewBinding3;
                GlSearchViewBinding glSearchViewBinding4;
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (z) {
                    glSearchViewBinding2 = this$0.binding;
                    if (glSearchViewBinding2.et.requestFocus()) {
                        glSearchViewBinding3 = this$0.binding;
                        Object systemService = glSearchViewBinding3.et.getContext().getSystemService("input_method");
                        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        glSearchViewBinding4 = this$0.binding;
                        ((InputMethodManager) systemService).showSoftInput(glSearchViewBinding4.et, 1);
                    }
                } else {
                    glSearchViewBinding = this$0.binding;
                    Context context = glSearchViewBinding.et.getContext();
                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                    ViewUtils.hideSoftInput((Activity) context);
                }
                done.invoke();
            }
        });
        ofInt.setDuration(150L);
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void searchBarExpandAnimation$lambda$8$lambda$7$lambda$6(SearchComponentView this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        EditText editText = this$0.binding.et;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        editText.setWidth(((Integer) animatedValue).intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0041, code lost:
    
        if ((!getRecentSearchName().isEmpty()) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void initRecent() {
        /*
            r4 = this;
            java.util.ArrayList<java.lang.String> r0 = r4.recentSearchList
            r0.clear()
            java.util.ArrayList<java.lang.String> r0 = r4.recentSearchList
            java.util.List r1 = r4.getRecentSearchName()
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            com.glority.android.picturexx.widget.SearchComponentView$RecentSearchAdapter r0 = r4.recentAdapter
            com.glority.android.picturexx.widget.SearchComponentView$initRecent$1 r1 = new com.glority.android.picturexx.widget.SearchComponentView$initRecent$1
            r1.<init>()
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            r0.setOnItemClickListener(r1)
            com.glority.android.picturexx.widget.SearchComponentView$RecentSearchAdapter r0 = r4.recentAdapter
            java.util.List r1 = r4.getRecentSearchName()
            r0.setNewData(r1)
            com.glority.android.picturexx.business.databinding.GlSearchViewBinding r0 = r4.binding
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.recentLl
            java.lang.String r1 = "recentLl"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.view.View r0 = (android.view.View) r0
            boolean r1 = r4.showRecent
            r2 = 0
            if (r1 == 0) goto L44
            java.util.List r1 = r4.getRecentSearchName()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L44
            goto L45
        L44:
            r3 = r2
        L45:
            if (r3 == 0) goto L48
            goto L4a
        L48:
            r2 = 8
        L4a:
            r0.setVisibility(r2)
            com.glority.android.picturexx.business.databinding.GlSearchViewBinding r0 = r4.binding
            android.widget.ImageView r0 = r0.deleteRecentIv
            com.glority.android.picturexx.widget.SearchComponentView$$ExternalSyntheticLambda6 r1 = new com.glority.android.picturexx.widget.SearchComponentView$$ExternalSyntheticLambda6
            r1.<init>()
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.widget.SearchComponentView.initRecent():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRecent$lambda$9(SearchComponentView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.clearRecentSearch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void search(String keyword) {
        Job launch$default;
        if (Intrinsics.areEqual(this.adapter.getKeyword(), keyword)) {
            return;
        }
        this.adapter.setKeyword(keyword);
        Job job = this.job;
        SearchCallback searchCallback = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (keyword.length() > 0) {
            if (this.searchCache.containsKey(keyword)) {
                List<SearchEntity> list = this.searchCache.get(keyword);
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                this.adapter.setNewData(list);
                RecyclerView rv = this.binding.rv;
                Intrinsics.checkNotNullExpressionValue(rv, "rv");
                rv.setVisibility(0);
                SearchCallback searchCallback2 = this.callback;
                if (searchCallback2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                } else {
                    searchCallback = searchCallback2;
                }
                View noSearchDisplayView = searchCallback.noSearchDisplayView();
                if (noSearchDisplayView != null) {
                    noSearchDisplayView.setVisibility(8);
                    return;
                }
                return;
            }
            LifecycleCoroutineScope lifecycleCoroutineScope = this.lifecycleCoroutineScope;
            if (lifecycleCoroutineScope == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lifecycleCoroutineScope");
                lifecycleCoroutineScope = null;
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, Dispatchers.getIO(), null, new SearchComponentView$search$1(this, keyword, null), 2, null);
            this.job = launch$default;
            return;
        }
        if (this.showRecent) {
            ConstraintLayout recentLl = this.binding.recentLl;
            Intrinsics.checkNotNullExpressionValue(recentLl, "recentLl");
            recentLl.setVisibility(0);
        }
        this.adapter.setNewData(new ArrayList());
        RecyclerView rv2 = this.binding.rv;
        Intrinsics.checkNotNullExpressionValue(rv2, "rv");
        rv2.setVisibility(8);
        SearchCallback searchCallback3 = this.callback;
        if (searchCallback3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
        } else {
            searchCallback = searchCallback3;
        }
        View noSearchDisplayView2 = searchCallback.noSearchDisplayView();
        if (noSearchDisplayView2 != null) {
            noSearchDisplayView2.setVisibility(0);
        }
    }

    public final void showBackIcon(boolean show) {
        ImageView backIv = this.binding.backIv;
        Intrinsics.checkNotNullExpressionValue(backIv, "backIv");
        backIv.setVisibility(show ? 0 : 8);
    }

    public final void showRecordSearch(boolean show) {
        this.showRecent = show;
        ConstraintLayout recentLl = this.binding.recentLl;
        Intrinsics.checkNotNullExpressionValue(recentLl, "recentLl");
        recentLl.setVisibility(show ? 0 : 8);
    }

    public final void setAdapter(SimpleAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.adapter = adapter;
        this.binding.rv.setAdapter(adapter);
        adapter.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.widget.SearchComponentView$setAdapter$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> adapter2, View view, int i) {
                SearchComponentView.SimpleAdapter simpleAdapter;
                SearchComponentView.SearchCallback searchCallback;
                Intrinsics.checkNotNullParameter(adapter2, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                SearchComponentView searchComponentView = SearchComponentView.this;
                simpleAdapter = searchComponentView.adapter;
                searchComponentView.updateRecentSearch(simpleAdapter.getKeyword());
                searchCallback = SearchComponentView.this.callback;
                if (searchCallback == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    searchCallback = null;
                }
                Object obj = adapter2.getData().get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.glority.android.picturexx.widget.SearchComponentView.SearchEntity");
                searchCallback.onItemClick(view, i, (SearchComponentView.SearchEntity) obj);
            }
        });
    }

    public final void setSearchHint(String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.searchHint = hint;
        this.binding.et.setHint(hint);
    }

    public final void setImageHolder(int holder) {
        this.imageHolder = holder;
    }

    public final void setHighLightColor(String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.highLightColor = color;
    }

    private final List<String> getRecentSearchName() {
        List<String> mutableList;
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(this.spName, 0);
        SearchCallback searchCallback = this.callback;
        if (searchCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            searchCallback = null;
        }
        List list = (List) new Gson().fromJson(sharedPreferences.getString(searchCallback.searchType(), ""), new TypeToken<List<? extends String>>() { // from class: com.glority.android.picturexx.widget.SearchComponentView$getRecentSearchName$1
        }.getType());
        return (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) ? new ArrayList() : mutableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if ((!r4.recentSearchList.isEmpty()) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateRecentSearch(java.lang.String r5) {
        /*
            r4 = this;
            java.util.ArrayList<java.lang.String> r0 = r4.recentSearchList
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L9
            return
        L9:
            java.util.ArrayList<java.lang.String> r0 = r4.recentSearchList
            int r0 = r0.size()
            int r1 = r4.maxRecentCount
            r2 = 0
            if (r0 < r1) goto L19
            java.util.ArrayList<java.lang.String> r0 = r4.recentSearchList
            r0.remove(r2)
        L19:
            java.util.ArrayList<java.lang.String> r0 = r4.recentSearchList
            r0.add(r5)
            android.content.Context r5 = r4.getContext()
            java.lang.String r0 = r4.spName
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r0, r2)
            java.lang.String r0 = "getSharedPreferences(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r0 = "editor"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            com.glority.android.picturexx.widget.SearchComponentView$SearchCallback r0 = r4.callback
            if (r0 != 0) goto L40
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
        L40:
            java.lang.String r0 = r0.searchType()
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            java.util.ArrayList<java.lang.String> r3 = r4.recentSearchList
            java.lang.String r1 = r1.toJson(r3)
            r5.putString(r0, r1)
            r5.apply()
            com.glority.android.picturexx.widget.SearchComponentView$RecentSearchAdapter r5 = r4.recentAdapter
            java.util.ArrayList<java.lang.String> r0 = r4.recentSearchList
            java.util.List r0 = (java.util.List) r0
            r5.setNewData(r0)
            com.glority.android.picturexx.business.databinding.GlSearchViewBinding r5 = r4.binding
            androidx.constraintlayout.widget.ConstraintLayout r5 = r5.recentLl
            java.lang.String r0 = "recentLl"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            android.view.View r5 = (android.view.View) r5
            boolean r0 = r4.showRecent
            if (r0 == 0) goto L7a
            java.util.ArrayList<java.lang.String> r0 = r4.recentSearchList
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L7a
            goto L7b
        L7a:
            r1 = r2
        L7b:
            if (r1 == 0) goto L7e
            goto L80
        L7e:
            r2 = 8
        L80:
            r5.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.widget.SearchComponentView.updateRecentSearch(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
    
        if ((!r5.recentSearchList.isEmpty()) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void clearRecentSearch() {
        /*
            r5 = this;
            java.util.ArrayList<java.lang.String> r0 = r5.recentSearchList
            r0.clear()
            com.glority.android.picturexx.widget.SearchComponentView$RecentSearchAdapter r0 = r5.recentAdapter
            java.util.ArrayList<java.lang.String> r1 = r5.recentSearchList
            java.util.List r1 = (java.util.List) r1
            r0.setNewData(r1)
            android.content.Context r0 = r5.getContext()
            java.lang.String r1 = r5.spName
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "getSharedPreferences(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "editor"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.glority.android.picturexx.widget.SearchComponentView$SearchCallback r1 = r5.callback
            if (r1 != 0) goto L31
            java.lang.String r1 = "callback"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r1 = 0
        L31:
            java.lang.String r1 = r1.searchType()
            com.google.gson.Gson r3 = new com.google.gson.Gson
            r3.<init>()
            java.util.ArrayList<java.lang.String> r4 = r5.recentSearchList
            java.lang.String r3 = r3.toJson(r4)
            r0.putString(r1, r3)
            r0.apply()
            com.glority.android.picturexx.business.databinding.GlSearchViewBinding r0 = r5.binding
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.recentLl
            java.lang.String r1 = "recentLl"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.view.View r0 = (android.view.View) r0
            boolean r1 = r5.showRecent
            if (r1 == 0) goto L62
            java.util.ArrayList<java.lang.String> r1 = r5.recentSearchList
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L62
            goto L63
        L62:
            r3 = r2
        L63:
            if (r3 == 0) goto L66
            goto L68
        L66:
            r2 = 8
        L68:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.widget.SearchComponentView.clearRecentSearch():void");
    }

    /* compiled from: SearchComponentView.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/glority/android/picturexx/widget/SearchComponentView$SimpleAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lcom/glority/android/picturexx/widget/SearchComponentView$SearchEntity;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "sv", "Lcom/glority/android/picturexx/widget/SearchComponentView;", "layoutId", "", "<init>", "(Lcom/glority/android/picturexx/widget/SearchComponentView;I)V", "getSv", "()Lcom/glority/android/picturexx/widget/SearchComponentView;", "keyword", "", "getKeyword", "()Ljava/lang/String;", "setKeyword", "(Ljava/lang/String;)V", "convert", "", "helper", "item", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class SimpleAdapter extends BaseQuickAdapter<SearchEntity, BaseViewHolder> {
        public static final int $stable = 8;
        private String keyword;
        private final int layoutId;
        private final SearchComponentView sv;

        public final SearchComponentView getSv() {
            return this.sv;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SimpleAdapter(SearchComponentView sv, int i) {
            super(i, null, 2, null);
            Intrinsics.checkNotNullParameter(sv, "sv");
            this.sv = sv;
            this.layoutId = i;
            this.keyword = "";
        }

        public final String getKeyword() {
            return this.keyword;
        }

        public final void setKeyword(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.keyword = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.glority.android.adapterhelper.BaseQuickAdapter
        public void convert(BaseViewHolder helper, SearchEntity item) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            helper.setText(R.id.title_tv, Html.fromHtml(StringsKt.replace(item.getName(), this.keyword, "<font color='" + this.sv.highLightColor + "'>" + this.keyword + "</font>", true)));
            helper.setText(R.id.desc_tv, item.getDesc());
            ImageView imageView = (ImageView) helper.getView(R.id.iv);
            Glide.with(imageView).load(item.getImageUrl()).transform(new CenterCrop(), new RoundedCorners(12)).placeholder(this.sv.imageHolder).into(imageView);
        }
    }

    /* compiled from: SearchComponentView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/widget/SearchComponentView$RecentSearchAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class RecentSearchAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
        public static final int $stable = 0;

        public RecentSearchAdapter() {
            super(R.layout.gl_item_search_recent, null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.glority.android.adapterhelper.BaseQuickAdapter
        public void convert(BaseViewHolder helper, String item) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            helper.setText(R.id.tv, item);
        }
    }
}

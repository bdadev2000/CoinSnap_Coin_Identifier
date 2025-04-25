package com.glority.widget.bottomsheet;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.xx.constants.Args;
import com.glority.widget.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlBottomSheetBuilder.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\u00020\u0001:\u0003=>?B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020$H\u0002J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u001fJ\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010+\u001a\u00020\u00002\b\b\u0001\u0010,\u001a\u00020\u001fJ\u000e\u0010-\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010/\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u000e\u00100\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u00101\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010J\u000e\u00102\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0017J\u000e\u00105\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u00106\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u001fJ\u0018\u00107\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\f2\b\b\u0002\u00108\u001a\u00020\u001bJ\u001a\u00107\u001a\u00020\u00002\b\b\u0001\u0010\"\u001a\u00020\u001f2\b\b\u0002\u00108\u001a\u00020\u001bJ\u000e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0015J\u0010\u00109\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020\u001fJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/glority/widget/bottomsheet/GlBottomSheetBuilder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bottomSheetDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getBottomSheetDialog$mod_release", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "setBottomSheetDialog$mod_release", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "desc", "", "drawable", "Landroid/graphics/drawable/Drawable;", "groups", "", "Lcom/glority/widget/bottomsheet/GlBottomSheetGroup;", FirebaseAnalytics.Param.ITEMS, "Lcom/glority/widget/bottomsheet/GlBottomSheetItem;", "maxHeightRatio", "", "onItemClickListener", "Lcom/glority/widget/bottomsheet/GlBottomSheetOnClickListener;", "orientation", "Lcom/glority/widget/bottomsheet/GlBottomSheetBuilder$Orientation;", "selectable", "", "showClose", "showDimBehind", "showMod", "", "showRatio", TtmlNode.TAG_STYLE, Args.title, "view", "Landroid/view/View;", "assertParams", "", "createView", "setBackgroundColor", "colorRes", "setBackgroundDrawable", "setBackgroundResource", "drawableRes", "setCustomView", "setDescription", "setGroups", "setItemOrientation", "setItems", "setMaxHeightRatio", "setOnItemClickListener", "glBottomSheetOnClickListener", "setSelectable", "setStyle", "setTitle", "showCloseIcon", "show", "Lcom/glority/widget/bottomsheet/GlBottomSheetDialog;", "ratio", "mod", "Companion", ExifInterface.TAG_ORIENTATION, "State", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlBottomSheetBuilder {
    public static final int COLLAPSED = 4;
    public static final int EXPANDED = 3;
    public static final int HALF_EXPANDED = 6;
    private BottomSheetDialog bottomSheetDialog;
    private final Context context;
    private CharSequence desc;
    private Drawable drawable;
    private List<GlBottomSheetGroup> groups;
    private List<GlBottomSheetItem> items;
    private float maxHeightRatio;
    private GlBottomSheetOnClickListener onItemClickListener;
    private Orientation orientation;
    private boolean selectable;
    private boolean showClose;
    private boolean showDimBehind;
    private int showMod;
    private float showRatio;
    private int style;
    private CharSequence title;
    private View view;

    /* compiled from: GlBottomSheetBuilder.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/glority/widget/bottomsheet/GlBottomSheetBuilder$Orientation;", "", "(Ljava/lang/String;I)V", "VERTICAL", "HORIZONTAL", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public enum Orientation {
        VERTICAL,
        HORIZONTAL
    }

    /* compiled from: GlBottomSheetBuilder.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/glority/widget/bottomsheet/GlBottomSheetBuilder$State;", "", "mod_release"}, k = 1, mv = {1, 4, 2})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: classes12.dex */
    public @interface State {
    }

    public GlBottomSheetBuilder(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.maxHeightRatio = 0.7f;
        this.showMod = 3;
        this.orientation = Orientation.VERTICAL;
        this.style = R.style.GlBottomSheetStyle;
    }

    /* renamed from: getBottomSheetDialog$mod_release, reason: from getter */
    public final BottomSheetDialog getBottomSheetDialog() {
        return this.bottomSheetDialog;
    }

    public final void setBottomSheetDialog$mod_release(BottomSheetDialog bottomSheetDialog) {
        this.bottomSheetDialog = bottomSheetDialog;
    }

    public final GlBottomSheetBuilder setStyle(int style) {
        this.style = style;
        return this;
    }

    public final GlBottomSheetBuilder setItems(List<GlBottomSheetItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        return this;
    }

    public final GlBottomSheetBuilder setGroups(List<GlBottomSheetGroup> groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.groups = groups;
        return this;
    }

    public final GlBottomSheetBuilder setDescription(CharSequence desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.desc = desc;
        return this;
    }

    public final GlBottomSheetBuilder setItemOrientation(Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.orientation = orientation;
        return this;
    }

    public final GlBottomSheetBuilder setBackgroundDrawable(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.drawable = drawable;
        return this;
    }

    public final GlBottomSheetBuilder setBackgroundResource(int drawableRes) {
        this.drawable = ActivityCompat.getDrawable(this.context, drawableRes);
        return this;
    }

    public final GlBottomSheetBuilder setBackgroundColor(int colorRes) {
        this.drawable = new ColorDrawable(ContextCompat.getColor(this.context, colorRes));
        return this;
    }

    public final GlBottomSheetBuilder setMaxHeightRatio(float maxHeightRatio) {
        this.maxHeightRatio = maxHeightRatio;
        return this;
    }

    public static /* synthetic */ GlBottomSheetBuilder setTitle$default(GlBottomSheetBuilder glBottomSheetBuilder, CharSequence charSequence, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return glBottomSheetBuilder.setTitle(charSequence, z);
    }

    public final GlBottomSheetBuilder setTitle(CharSequence title, boolean showCloseIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.showClose = showCloseIcon;
        return this;
    }

    public static /* synthetic */ GlBottomSheetBuilder setTitle$default(GlBottomSheetBuilder glBottomSheetBuilder, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return glBottomSheetBuilder.setTitle(i, z);
    }

    public final GlBottomSheetBuilder setTitle(int title, boolean showCloseIcon) {
        this.title = this.context.getString(title);
        this.showClose = showCloseIcon;
        return this;
    }

    public final GlBottomSheetBuilder setSelectable(boolean selectable) {
        this.selectable = selectable;
        return this;
    }

    public final GlBottomSheetBuilder setOnItemClickListener(GlBottomSheetOnClickListener glBottomSheetOnClickListener) {
        Intrinsics.checkNotNullParameter(glBottomSheetOnClickListener, "glBottomSheetOnClickListener");
        this.onItemClickListener = glBottomSheetOnClickListener;
        return this;
    }

    public final GlBottomSheetBuilder showDimBehind(boolean show) {
        this.showDimBehind = show;
        return this;
    }

    public final GlBottomSheetBuilder setCustomView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        return this;
    }

    public static /* synthetic */ GlBottomSheetDialog show$default(GlBottomSheetBuilder glBottomSheetBuilder, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 4;
        }
        return glBottomSheetBuilder.show(i);
    }

    public final GlBottomSheetDialog show(int mod) {
        this.showMod = mod;
        assertParams();
        View view = this.view;
        if (view == null) {
            view = createView();
        } else {
            Intrinsics.checkNotNull(view);
        }
        GlBottomSheetDialog glBottomSheetDialog = new GlBottomSheetDialog(this.context, this.style);
        glBottomSheetDialog.setContentView(view, new ViewGroup.LayoutParams(-1, -2));
        glBottomSheetDialog.showDimBehind$mod_release(this.showDimBehind);
        glBottomSheetDialog.setShowMod$mod_release(this.showMod, this.showRatio);
        glBottomSheetDialog.setMaxHeightRatio$mod_release(Float.valueOf(this.maxHeightRatio));
        glBottomSheetDialog.show();
        this.bottomSheetDialog = glBottomSheetDialog;
        return glBottomSheetDialog;
    }

    public final GlBottomSheetDialog show(float ratio) {
        this.showMod = 6;
        this.showRatio = ratio;
        createView();
        return show(6);
    }

    private final View createView() {
        List<GlBottomSheetItem> list;
        View container = LayoutInflater.from(this.context).inflate(R.layout.gl_bottom_sheet, (ViewGroup) null);
        TextView descTv = (TextView) container.findViewById(R.id.desc);
        View header = container.findViewById(R.id.header_ll);
        TextView titleTv = (TextView) container.findViewById(R.id.title);
        ImageView ivClose = (ImageView) container.findViewById(R.id.close_iv);
        CharSequence charSequence = this.desc;
        if (charSequence == null || charSequence.length() == 0) {
            Intrinsics.checkNotNullExpressionValue(descTv, "descTv");
            descTv.setVisibility(8);
        } else {
            Intrinsics.checkNotNullExpressionValue(descTv, "descTv");
            descTv.setText(this.desc);
        }
        if (this.title == null) {
            Intrinsics.checkNotNullExpressionValue(header, "header");
            header.setVisibility(8);
        } else {
            Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
            titleTv.setText(this.title);
        }
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        int i = 0;
        ivClose.setVisibility(this.showClose ? 0 : 8);
        ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.bottomsheet.GlBottomSheetBuilder$createView$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = GlBottomSheetBuilder.this.getBottomSheetDialog();
                if (bottomSheetDialog != null) {
                    bottomSheetDialog.dismiss();
                }
            }
        });
        RecyclerView rv = (RecyclerView) container.findViewById(R.id.rv);
        Drawable drawable = this.drawable;
        if (drawable != null) {
            Intrinsics.checkNotNullExpressionValue(container, "container");
            container.setBackground(drawable);
        }
        if (this.orientation == Orientation.HORIZONTAL && (list = this.items) != null) {
            Intrinsics.checkNotNull(list);
            if (list.size() > 4) {
                Intrinsics.checkNotNullExpressionValue(rv, "rv");
                rv.setLayoutManager(new LinearLayoutManager(this.context, 0, false));
            } else {
                Intrinsics.checkNotNullExpressionValue(rv, "rv");
                FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this.context, 0, 0);
                flexboxLayoutManager.setJustifyContent(4);
                Unit unit = Unit.INSTANCE;
                rv.setLayoutManager(flexboxLayoutManager);
            }
            List<GlBottomSheetItem> list2 = this.items;
            Intrinsics.checkNotNull(list2);
            List<GlBottomSheetItem> list3 = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair((GlBottomSheetItem) it.next(), 4));
            }
            rv.setAdapter(new GlBottomSheetAdapter(arrayList, this, this.onItemClickListener, this.selectable));
        } else {
            ArrayList arrayList2 = new ArrayList();
            List<GlBottomSheetGroup> list4 = this.groups;
            int size = list4 != null ? list4.size() : 0;
            List<GlBottomSheetGroup> list5 = this.groups;
            if (list5 != null) {
                for (Object obj : list5) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    GlBottomSheetGroup glBottomSheetGroup = (GlBottomSheetGroup) obj;
                    if (1 <= i && size > i) {
                        arrayList2.add(new Pair(new Object(), 2));
                    }
                    String name = glBottomSheetGroup.getName();
                    if (name == null) {
                    }
                    arrayList2.add(new Pair(name, 1));
                    List<GlBottomSheetItem> items = glBottomSheetGroup.getItems();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
                    Iterator<T> it2 = items.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(new Pair((GlBottomSheetItem) it2.next(), 3));
                    }
                    arrayList2.addAll(arrayList3);
                    i = i2;
                }
            }
            List<GlBottomSheetItem> list6 = this.items;
            if (list6 != null) {
                List<GlBottomSheetItem> list7 = list6;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
                Iterator<T> it3 = list7.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(new Pair((GlBottomSheetItem) it3.next(), 3));
                }
                arrayList2.addAll(arrayList4);
            }
            Intrinsics.checkNotNullExpressionValue(rv, "rv");
            rv.setLayoutManager(new LinearLayoutManager(this.context));
            rv.setAdapter(new GlBottomSheetAdapter(arrayList2, this, this.onItemClickListener, this.selectable));
        }
        Intrinsics.checkNotNullExpressionValue(container, "container");
        return container;
    }

    private final void assertParams() {
        if (this.items != null && this.groups != null && this.view != null) {
            throw new IllegalArgumentException("only items or groups or view");
        }
        if (this.orientation == Orientation.HORIZONTAL && this.groups != null) {
            throw new IllegalArgumentException("groups not supported  HORIZONTAL");
        }
    }
}

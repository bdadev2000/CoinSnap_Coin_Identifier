package com.glority.widget.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.core.view.ViewGroupKt;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.glority.widget.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: GlBottomNavigationView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\rH\u0002J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0007J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\"\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0&J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0007H\u0002J\u000e\u0010)\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0007J\u000e\u0010*\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0007J\u000e\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u0007J\u0016\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u000b*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u000b*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/glority/widget/bottomnavigation/GlBottomNavigationView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "centerIv", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", TtmlNode.RUBY_CONTAINER, "Landroid/view/View;", "endContainer", "Landroid/widget/LinearLayout;", "holderView", "itemContainer", "menuBuilder", "Landroidx/appcompat/view/menu/MenuBuilder;", "menuIds", "", "menuInflater", "Landroidx/appcompat/view/SupportMenuInflater;", "startContainer", "topIv", "addItemView", "", "view", "id", "addItemViewByMenu", "changeDrawableColor", "Landroid/graphics/drawable/Drawable;", "drawable", "beforeColor", "Landroid/graphics/Color;", "changeColor", "getAllMenu", "", "inflateMenu", "menuResourceId", "removeItemViewById", "selected", "setCenterClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "setGlBackgroundColor", "color", "setItemClickListener", "itemId", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlBottomNavigationView extends FrameLayout {
    private final ImageView centerIv;
    private final View container;
    private final LinearLayout endContainer;
    private final View holderView;
    private final LinearLayout itemContainer;
    private final MenuBuilder menuBuilder;
    private final List<View> menuIds;
    private final SupportMenuInflater menuInflater;
    private final LinearLayout startContainer;
    private final ImageView topIv;

    public GlBottomNavigationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public GlBottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlBottomNavigationView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            r2 = 0
            r5 = r2
            android.util.AttributeSet r5 = (android.util.AttributeSet) r5
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.bottomnavigation.GlBottomNavigationView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlBottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.menuInflater = new SupportMenuInflater(context);
        MenuBuilder menuBuilder = new MenuBuilder(context);
        this.menuBuilder = menuBuilder;
        View inflate = LayoutInflater.from(context).inflate(R.layout.gl_bottom_navigation_view, this);
        this.container = inflate;
        this.startContainer = (LinearLayout) inflate.findViewById(R.id.start_container);
        this.endContainer = (LinearLayout) inflate.findViewById(R.id.end_container);
        this.itemContainer = (LinearLayout) inflate.findViewById(R.id.item_container);
        ImageView topIv = (ImageView) inflate.findViewById(R.id.top_iv);
        this.topIv = topIv;
        View holderView = inflate.findViewById(R.id.holder_v);
        this.holderView = holderView;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.center_iv);
        this.centerIv = imageView;
        this.menuIds = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.GlBottomNavigationView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…e.GlBottomNavigationView)");
        if (obtainStyledAttributes.hasValue(R.styleable.GlBottomNavigationView_menu)) {
            inflateMenu(obtainStyledAttributes.getResourceId(R.styleable.GlBottomNavigationView_menu, 0));
            addItemViewByMenu(menuBuilder);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.GlBottomNavigationView_gl_background_color)) {
            setGlBackgroundColor(obtainStyledAttributes.getColor(R.styleable.GlBottomNavigationView_gl_background_color, 0));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.GlBottomNavigationView_center_icon)) {
            imageView.setImageResource(obtainStyledAttributes.getResourceId(R.styleable.GlBottomNavigationView_center_icon, 0));
        } else {
            Intrinsics.checkNotNullExpressionValue(holderView, "holderView");
            holderView.setVisibility(8);
            Intrinsics.checkNotNullExpressionValue(topIv, "topIv");
            topIv.setVisibility(8);
        }
        obtainStyledAttributes.recycle();
    }

    private final void inflateMenu(int menuResourceId) {
        this.menuInflater.inflate(menuResourceId, this.menuBuilder);
    }

    private final void addItemView(View view) {
        this.menuIds.add(view);
        LinearLayout startContainer = this.startContainer;
        Intrinsics.checkNotNullExpressionValue(startContainer, "startContainer");
        int childCount = startContainer.getChildCount();
        LinearLayout endContainer = this.endContainer;
        Intrinsics.checkNotNullExpressionValue(endContainer, "endContainer");
        if (childCount > endContainer.getChildCount()) {
            this.endContainer.addView(view, new LinearLayout.LayoutParams(0, -1, 1.0f));
        } else {
            this.startContainer.addView(view, new LinearLayout.LayoutParams(0, -1, 1.0f));
        }
    }

    public final void addItemView(View view, int id) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setId(id);
        addItemView(view);
    }

    private final void addItemViewByMenu(MenuBuilder menuBuilder) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            GlBottomNavigationItemView glBottomNavigationItemView = new GlBottomNavigationItemView(context, null, 0, 6, null);
            MenuBuilder menuBuilder2 = menuBuilder;
            MenuItem item = menuBuilder2.getItem(i);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(index)");
            glBottomNavigationItemView.setTitle(item.getTitle().toString());
            MenuItem item2 = menuBuilder2.getItem(i);
            Intrinsics.checkNotNullExpressionValue(item2, "getItem(index)");
            Drawable icon = item2.getIcon();
            Intrinsics.checkNotNullExpressionValue(icon, "menuBuilder.get(i).icon");
            glBottomNavigationItemView.setIcon(icon);
            MenuItem item3 = menuBuilder2.getItem(i);
            Intrinsics.checkNotNullExpressionValue(item3, "getItem(index)");
            glBottomNavigationItemView.setId(item3.getItemId());
            addItemView(glBottomNavigationItemView);
        }
    }

    public final void removeItemViewById(int id) {
        Object obj;
        LinearLayout startContainer = this.startContainer;
        Intrinsics.checkNotNullExpressionValue(startContainer, "startContainer");
        Sequence<View> children = ViewGroupKt.getChildren(startContainer);
        LinearLayout endContainer = this.endContainer;
        Intrinsics.checkNotNullExpressionValue(endContainer, "endContainer");
        List mutableList = SequencesKt.toMutableList(SequencesKt.plus((Sequence) children, (Sequence) ViewGroupKt.getChildren(endContainer)));
        List mutableList2 = CollectionsKt.toMutableList((Collection) mutableList);
        List list = mutableList;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((View) obj).getId() == id) {
                    break;
                }
            }
        }
        if (mutableList2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
        TypeIntrinsics.asMutableCollection(mutableList2).remove(obj);
        this.startContainer.removeAllViews();
        this.endContainer.removeAllViews();
        this.menuIds.clear();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            addItemView((View) it2.next());
        }
    }

    public final void setItemClickListener(int itemId, final View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        View findViewById = findViewById(itemId);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.bottomnavigation.GlBottomNavigationView$setItemClickListener$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View it) {
                    GlBottomNavigationView glBottomNavigationView = GlBottomNavigationView.this;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    glBottomNavigationView.selected(it.getId());
                    onClickListener.onClick(it);
                }
            });
        }
    }

    public final void setCenterClickListener(View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.centerIv.setOnClickListener(onClickListener);
    }

    public final void setGlBackgroundColor(int color) {
        Drawable drawable = getResources().getDrawable(R.drawable.ic_bg_tab_bar_gl);
        Intrinsics.checkNotNullExpressionValue(drawable, "resources.getDrawable(R.drawable.ic_bg_tab_bar_gl)");
        Color valueOf = Color.valueOf(16448250);
        Intrinsics.checkNotNullExpressionValue(valueOf, "Color.valueOf(0xFAFAFA)");
        Color valueOf2 = Color.valueOf(color);
        Intrinsics.checkNotNullExpressionValue(valueOf2, "Color.valueOf(color)");
        this.topIv.setImageDrawable(changeDrawableColor(drawable, valueOf, valueOf2));
        this.itemContainer.setBackgroundColor(color);
    }

    public final void selected(int id) {
        for (View view : this.menuIds) {
            view.setSelected(view.getId() == id);
        }
    }

    public final List<View> getAllMenu() {
        return this.menuIds;
    }

    private final Drawable changeDrawableColor(Drawable drawable, Color beforeColor, Color changeColor) {
        Bitmap bitmap$default;
        Resources resources = getResources();
        int i = R.drawable.ic_bg_tab_bar_gl;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        VectorDrawableCompat create = VectorDrawableCompat.create(resources, i, context.getTheme());
        if (create == null || (bitmap$default = DrawableKt.toBitmap$default(create, 0, 0, null, 7, null)) == null) {
            return null;
        }
        int width = bitmap$default.getWidth() * bitmap$default.getHeight();
        int[] iArr = new int[width];
        bitmap$default.getPixels(iArr, 0, bitmap$default.getWidth(), 0, 0, bitmap$default.getWidth(), bitmap$default.getHeight());
        int argb = changeColor.toArgb();
        for (int i2 = 0; i2 < width; i2++) {
            Color valueOf = Color.valueOf(iArr[i2]);
            Intrinsics.checkNotNullExpressionValue(valueOf, "Color.valueOf(px[i])");
            if (valueOf.red() == beforeColor.red() && valueOf.green() == beforeColor.green() && valueOf.blue() == beforeColor.blue()) {
                iArr[i2] = argb;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, 0, bitmap$default.getWidth(), bitmap$default.getWidth(), bitmap$default.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "Bitmap.createBitmap(\n   …g.ARGB_8888\n            )");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        Resources resources2 = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "context.resources");
        return new BitmapDrawable(resources2, createBitmap);
    }
}

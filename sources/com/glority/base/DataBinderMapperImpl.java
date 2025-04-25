package com.glority.base;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.base.databinding.ActivityImageViewerBindingImpl;
import com.glority.base.databinding.EmptyViewBindingImpl;
import com.glority.base.databinding.FragmentCommonWebBindingImpl;
import com.glority.base.databinding.FragmentImageViewerBindingImpl;
import com.glority.base.databinding.ItemContentFeedbackEditBindingImpl;
import com.glority.base.databinding.ItemContentFeedbackTextBindingImpl;
import com.glority.base.databinding.LayoutToolbarBindingImpl;
import com.glority.base.databinding.WidgetFiveStarRatingBarBindingImpl;
import com.glority.base.databinding.WidgetSettingItemBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_ACTIVITYIMAGEVIEWER = 1;
    private static final int LAYOUT_EMPTYVIEW = 2;
    private static final int LAYOUT_FRAGMENTCOMMONWEB = 3;
    private static final int LAYOUT_FRAGMENTIMAGEVIEWER = 4;
    private static final int LAYOUT_ITEMCONTENTFEEDBACKEDIT = 5;
    private static final int LAYOUT_ITEMCONTENTFEEDBACKTEXT = 6;
    private static final int LAYOUT_LAYOUTTOOLBAR = 7;
    private static final int LAYOUT_WIDGETFIVESTARRATINGBAR = 8;
    private static final int LAYOUT_WIDGETSETTINGITEM = 9;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(9);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.activity_image_viewer, 1);
        sparseIntArray.put(R.layout.empty_view, 2);
        sparseIntArray.put(R.layout.fragment_common_web, 3);
        sparseIntArray.put(R.layout.fragment_image_viewer, 4);
        sparseIntArray.put(R.layout.item_content_feedback_edit, 5);
        sparseIntArray.put(R.layout.item_content_feedback_text, 6);
        sparseIntArray.put(R.layout.layout_toolbar, 7);
        sparseIntArray.put(R.layout.widget_five_star_rating_bar, 8);
        sparseIntArray.put(R.layout.widget_setting_item, 9);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i2) {
            case 1:
                if ("layout/activity_image_viewer_0".equals(tag)) {
                    return new ActivityImageViewerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_image_viewer is invalid. Received: " + tag);
            case 2:
                if ("layout/empty_view_0".equals(tag)) {
                    return new EmptyViewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for empty_view is invalid. Received: " + tag);
            case 3:
                if ("layout/fragment_common_web_0".equals(tag)) {
                    return new FragmentCommonWebBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_common_web is invalid. Received: " + tag);
            case 4:
                if ("layout/fragment_image_viewer_0".equals(tag)) {
                    return new FragmentImageViewerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_image_viewer is invalid. Received: " + tag);
            case 5:
                if ("layout/item_content_feedback_edit_0".equals(tag)) {
                    return new ItemContentFeedbackEditBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_content_feedback_edit is invalid. Received: " + tag);
            case 6:
                if ("layout/item_content_feedback_text_0".equals(tag)) {
                    return new ItemContentFeedbackTextBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_content_feedback_text is invalid. Received: " + tag);
            case 7:
                if ("layout/layout_toolbar_0".equals(tag)) {
                    return new LayoutToolbarBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_toolbar is invalid. Received: " + tag);
            case 8:
                if ("layout/widget_five_star_rating_bar_0".equals(tag)) {
                    return new WidgetFiveStarRatingBarBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_five_star_rating_bar is invalid. Received: " + tag);
            case 9:
                if ("layout/widget_setting_item_0".equals(tag)) {
                    return new WidgetSettingItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_setting_item is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return InnerBrLookup.sKeys.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.apis.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.core.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.DataBinderMapperImpl());
        return arrayList;
    }

    /* loaded from: classes6.dex */
    private static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        private InnerBrLookup() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* loaded from: classes6.dex */
    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        private InnerLayoutIdLookup() {
        }

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(9);
            sKeys = hashMap;
            hashMap.put("layout/activity_image_viewer_0", Integer.valueOf(R.layout.activity_image_viewer));
            hashMap.put("layout/empty_view_0", Integer.valueOf(R.layout.empty_view));
            hashMap.put("layout/fragment_common_web_0", Integer.valueOf(R.layout.fragment_common_web));
            hashMap.put("layout/fragment_image_viewer_0", Integer.valueOf(R.layout.fragment_image_viewer));
            hashMap.put("layout/item_content_feedback_edit_0", Integer.valueOf(R.layout.item_content_feedback_edit));
            hashMap.put("layout/item_content_feedback_text_0", Integer.valueOf(R.layout.item_content_feedback_text));
            hashMap.put("layout/layout_toolbar_0", Integer.valueOf(R.layout.layout_toolbar));
            hashMap.put("layout/widget_five_star_rating_bar_0", Integer.valueOf(R.layout.widget_five_star_rating_bar));
            hashMap.put("layout/widget_setting_item_0", Integer.valueOf(R.layout.widget_setting_item));
        }
    }
}

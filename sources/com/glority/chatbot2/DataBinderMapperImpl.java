package com.glority.chatbot2;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.chatbot2.databinding.ChatbotDialogChatbotSurveyBindingImpl;
import com.glority.chatbot2.databinding.ChatbotFragmentChatbotBindingImpl;
import com.glority.chatbot2.databinding.ChatbotWidgetFiveStarRatingBarBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_CHATBOTDIALOGCHATBOTSURVEY = 1;
    private static final int LAYOUT_CHATBOTFRAGMENTCHATBOT = 2;
    private static final int LAYOUT_CHATBOTWIDGETFIVESTARRATINGBAR = 3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.chatbot_dialog_chatbot_survey, 1);
        sparseIntArray.put(R.layout.chatbot_fragment_chatbot, 2);
        sparseIntArray.put(R.layout.chatbot_widget_five_star_rating_bar, 3);
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
        if (i2 == 1) {
            if ("layout/chatbot_dialog_chatbot_survey_0".equals(tag)) {
                return new ChatbotDialogChatbotSurveyBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for chatbot_dialog_chatbot_survey is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/chatbot_fragment_chatbot_0".equals(tag)) {
                return new ChatbotFragmentChatbotBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for chatbot_fragment_chatbot is invalid. Received: " + tag);
        }
        if (i2 != 3) {
            return null;
        }
        if ("layout/chatbot_widget_five_star_rating_bar_0".equals(tag)) {
            return new ChatbotWidgetFiveStarRatingBarBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for chatbot_widget_five_star_rating_bar is invalid. Received: " + tag);
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
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.core.DataBinderMapperImpl());
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
            HashMap<String, Integer> hashMap = new HashMap<>(3);
            sKeys = hashMap;
            hashMap.put("layout/chatbot_dialog_chatbot_survey_0", Integer.valueOf(R.layout.chatbot_dialog_chatbot_survey));
            hashMap.put("layout/chatbot_fragment_chatbot_0", Integer.valueOf(R.layout.chatbot_fragment_chatbot));
            hashMap.put("layout/chatbot_widget_five_star_rating_bar_0", Integer.valueOf(R.layout.chatbot_widget_five_star_rating_bar));
        }
    }
}

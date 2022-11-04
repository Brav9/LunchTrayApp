package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckoutBindingImpl extends FragmentCheckoutBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.order_summary, 2);
        sViewsWithIds.put(R.id.entree_selection, 3);
        sViewsWithIds.put(R.id.entree_price, 4);
        sViewsWithIds.put(R.id.side_selection, 5);
        sViewsWithIds.put(R.id.side_price, 6);
        sViewsWithIds.put(R.id.accompaniment_selection, 7);
        sViewsWithIds.put(R.id.accompaniment_price, 8);
        sViewsWithIds.put(R.id.divider, 9);
        sViewsWithIds.put(R.id.subtotal, 10);
        sViewsWithIds.put(R.id.tax, 11);
        sViewsWithIds.put(R.id.total, 12);
        sViewsWithIds.put(R.id.submit_button, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCheckoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentCheckoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.Button) bindings[1]
            , (android.view.View) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.Button) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            );
        this.cancelButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.checkoutFragment == variableId) {
            setCheckoutFragment((com.example.lunchtray.ui.order.CheckoutFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCheckoutFragment(@Nullable com.example.lunchtray.ui.order.CheckoutFragment CheckoutFragment) {
        this.mCheckoutFragment = CheckoutFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.checkoutFragment);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback6);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // checkoutFragment != null
        boolean checkoutFragmentJavaLangObjectNull = false;
        // checkoutFragment
        com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;



        checkoutFragmentJavaLangObjectNull = (checkoutFragment) != (null);
        if (checkoutFragmentJavaLangObjectNull) {


            checkoutFragment.cancelOrder();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): checkoutFragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
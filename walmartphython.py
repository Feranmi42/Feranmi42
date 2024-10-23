def couponCost(coupons, prefrences){
    const customerswhousedCoupon = new set();
    const results ={};

     for(let i=0;i<preference.length; i++){
        preference = preferance[i];
     for(let j = 0; j< coupons.length; j++){
         coupon = coupons[j];
         const customer = coupon[0];
         const department = coupon[1];
         const discount = parseInt(coupon[2]);
         if (prefrence == department &&! customersWhousedCoupons.has(customer)){
             if(!result[department]){
               results[department] = discount;
             }
             else{
                 results[department] += discount;
             }
             customersWhoUsedCoupon.add(customer);
         }
       }
     }
     return results;
}
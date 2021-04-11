    static int pairs(int k, int[] arr) {
      int pairs=0;
      int len = arr.length;
      Arrays.sort(arr);
      for(int i=0 ; i<arr.length ;i++){
          for(int j=i+1; j<arr.length;j++){
              if(arr[j]+k==arr[i]||arr[i]+k==arr[j]){
                  pairs++;
                  break;
              }
          }
      }
      return pairs;
    }

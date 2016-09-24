import React, {Component} from 'react';
import { Link } from 'react-router';

class MedicalHome extends Component {
    render(){
        return(
            <div>
                Home
                {this.props.params.id}
            </div>
        );
    }
}

export default MedicalHome